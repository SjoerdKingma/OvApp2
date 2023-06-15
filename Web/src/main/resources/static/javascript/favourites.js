



   const from = document.getElementById('van');
   const to = document.getElementById('naar');

   var valuesArray =[];


   // get and set from localStorage.
   function getItem(item) {

        const getItem = localStorage.getItem(item);
        return JSON.parse(getItem); // convert to javascript object
   }

   function setItem(item) {

        const itemStringify = JSON.stringify(valuesArray);// convert to String
        localStorage.setItem(item, itemStringify);
   }


   // When add to favourites button is clicked, values are saved in array in localStorage and list is loaded
  function addFavToStorage(){

      const addButton = document.getElementById('addFavourite');
      addButton.addEventListener('click', function(){
         const locations = { 'From': from.value,
                              'To': to.value
                           };
         //previously added locations won't be added again using some()
         //some() is used to check if elements in an array meet a certain condition
         //check if the value of new object is the same as another existing object in the array
         const locationsExists = valuesArray.some(val => val.From === locations.From
                                                        && val.To === locations.To);
         if(locationsExists){
              alert('exists');
         }else {
              valuesArray.push(locations);
              setItem('inputValues');
              loadLayer();
         }
     });
  }

   addFavToStorage();

 // for each value in array we create an li element and load it in list of favourites.
  function loadLayer() {
        const parseArray = getItem('inputValues');
        for (let i = 0; i < parseArray.length; i++) {
           let layer  = createLayer(parseArray[i]); // for each create layer (li)
           appendLayer(layer);
      }
  }

  function createLayer(locations) {

        let li = document.createElement('li');
        li.className = 'list-group-item';
        let p = document.createElement('p');
        p.className = 'list-group-para';

        const languageSelection = document.getElementById('language-select');// change text according to the language selected
        const selectedLanguage = languageSelection.value
        if (selectedLanguage == "nl"){
        console.log(selectedLanguage.value);
        p.textContent = "Van: " + locations.From + " , Naar: " + locations.To;
        } else{ p.textContent = "From: " + locations.From + " , To: " + locations.To;
        }

        li.appendChild(p);
        return li;
  }

  function appendLayer(layer) {
        let layerList = document.getElementById('rectangle');
        layerList.appendChild(layer);
  }

loadLayer();



// add values from list of favourites back to from and to
 function addFromFavourites(){
       let getLu = document.querySelector('.rectangle');
       let getLi = getLu.querySelectorAll('li.list-group-item');

       getLi.forEach(function(li) {
         let p = li.querySelector('.list-group-para');
         let text = p.textContent;
         let splitText = text.split(' '); // split text between each ' '
         let newFromValue = splitText[1];// New from value is at index 1
         let newToValue = splitText[4];

         li.addEventListener('click', function() {
         // when li (layer) is clicked the from and to properties
         // are added to from and to fields.
           from.value = newFromValue;
           to.value = newToValue;
       });
    });
  }


 addFromFavourites();


