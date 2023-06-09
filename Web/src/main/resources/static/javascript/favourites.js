



   const fromValue = document.getElementById('van');
   const toValue = document.getElementById('naar');
   var inputValues =[];

  function addFavToStorage(){

      const addButton = document.getElementById('addFavourite');
      addButton.addEventListener('click', function(){
         const values = { 'From': fromValue.value, 'To': toValue.value };
         const inputValuesExists = inputValues.some(val => val.From === values.From && val.To === values.To); //check if the new object values the same as in  inputvalues array
         if(inputValuesExists){
              console.log('exists');
         }else {
              inputValues.push(values);
              localStorage.setItem('inputValues', JSON.stringify(inputValues)); // convert to String
              console.log(localStorage);
              loadLayer(values);
         }
     });
  }

   addFavToStorage();


  function loadLayer(values) {
       let parse = JSON.parse(localStorage.getItem('inputValues')); // convert back to a JSON object
        for (let i = 0; i < parse.length; i++) {
           let layer  = createLayer(parse[i]); // for each create layer
           appendLayer(layer);
      }
  }

  function createLayer(values) {

        let li = document.createElement('li');
        li.className = "list-group-item";
        let x = document.createElement('p');
        x.textContent = JSON.stringify(values);
//        x.textContent = parse;
//      for (i = 0; i < localStorage.length; i++) {
//        let key = localStorage.key(i);
////         x.innerHTML +=key;}
//        let y = JSON.parse(localStorage.getItem('inputValues'));
//         x.textContent = y.From + y.To;
        //convert to Jsonobject and then x.textContent
        console.log(x.value);
        li.appendChild(x);
        return li;
    }

    function appendLayer(layer) {
        let layerList = document.getElementById('rectangle');
        layerList.appendChild(layer);
    }

loadLayer();

