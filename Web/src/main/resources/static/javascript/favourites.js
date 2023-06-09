



   const from = document.getElementById('van');
   const to = document.getElementById('naar');
   var inputValues =[];

  function addFavToStorage(){

      const addButton = document.getElementById('addFavourite');
      addButton.addEventListener('click', function(){
         const locations = { 'From': from.value, 'To': to.value };
         console.log(locations);
         const inputValuesExists = inputValues.some(val => val.From === locations.From && val.To === locations.To); //check if the new object values the same as in  inputvalues array
         if(inputValuesExists){
              console.log('exists');
         }else {
              inputValues.push(locations);
              localStorage.setItem('inputValues', JSON.stringify(inputValues)); // convert to String
              console.log(localStorage);
              loadLayer(locations);
         }
     });
  }

   addFavToStorage();


  function loadLayer() {
       let parse = JSON.parse(localStorage.getItem('inputValues')); // convert to javascript object
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
        p.textContent = "From: " + locations.From + " , To: " + locations.To;
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

 function addFromFavourites(){
       let getItem = document.querySelector('.list-group-item');
       getItem.onclick = () => {
       let p = document.querySelector('.list-group-para');
       let text = p.textContent;
       console.log(typeof text);
       let splitText = text.split(' ');
       let newFromValue = splitText[1];
       let newToValue = splitText[4];
       from.value = newFromValue;
       to.value = newToValue;
    }

 }

 addFromFavourites();

