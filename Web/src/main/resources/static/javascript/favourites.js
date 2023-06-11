



   const from = document.getElementById('van');
   const to = document.getElementById('naar');

   const getItem = localStorage.getItem('inputValues');
   const parse = JSON.parse(getItem); // convert to javascript object

   var valuesArray =[];

   // When add to favourites button is clicked, values are saved in array in localStorage and list is loaded
  function addFavToStorage(){

      const addButton = document.getElementById('addFavourite');
      addButton.addEventListener('click', function(){
         const locations = { 'From': from.value,
                              'To': to.value
                           };
         const locationsExists = valuesArray.some(val => val.From === locations.From
                                                        && val.To === locations.To); //check if the new object values the same as objects in array
         if(locationsExists){
              console.log('exists');
         }else {
              valuesArray.push(locations);
              valuesArrayString = JSON.stringify(valuesArray);// convert to String
              localStorage.setItem('inputValues', valuesArrayString);
              console.log(localStorage);
              loadLayer();
         }
     });
  }

   addFavToStorage();

 // for each value in array we create an li element
  function loadLayer() {
        for (let i = 0; i < parse.length; i++) {
           let layer  = createLayer(parse[i]); // for each create layer (li)
           appendLayer(layer);
      }
  }

  function createLayer(locations) {

        let li = document.createElement('li');
        li.className = "list-group-item";
        let p = document.createElement('p');
        p.className = "list-group-para";
        const languageSelection = document.getElementById('language-select');// change text according to the language selected
        const selectedLanguage = languageSelection.value
        if (selectedLanguage == "nl"){
        console.log(selectedLanguage.value);
        p.textContent = "Van: " + locations.From + " , Naar: " + locations.To;
        } else{ p.textContent = "From: " + locations.From + " , To: " + locations.To;}
        console.log(p);
        console.log(p.value);
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
         console.log(typeof text);
         let splitText = text.split(' ');
         let newFromValue = splitText[1];
         let newToValue = splitText[4];

         li.addEventListener('click', function() {
           from.value = newFromValue;
           to.value = newToValue;
       });
    });
  }


 addFromFavourites();


