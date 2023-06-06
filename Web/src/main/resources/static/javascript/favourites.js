

  const addButton = document.getElementById('addFavourite');
  const fromValue = document.getElementById('van');
  const toValue = document.getElementById('naar');
  var inputValues =[];
  const values = { 'From': fromValue.value, 'To': toValue.value };
  let p = JSON.parse(localStorage.getItem('inputValues'));

  function addFavourite(){


      addButton.addEventListener('click', function(){
//       localStorage.clear();
      const values = { 'From': fromValue.value, 'To': toValue.value };
      const inputValuesExists = inputValues.some(val => val.From === values.From && val.To === values.To); //check if the new object values the same as in  inputvalues array
      if(inputValuesExists){
            console.log('exists');
      } else {
            inputValues.push(values);
            localStorage.setItem('inputValues', JSON.stringify(inputValues)); // convert to String
            console.log(localStorage);
            loadLayer(p);
       }
    });
  }

   addFavourite();

  function loadLayer() {

        let p = JSON.parse(localStorage.getItem('inputValues')); // convert back to a JSON object
        for (let i = 0; i < p.length; i++) {
          let n  = createLayer(p[i]); // for each create layer
          appendLayer(n);
      }
  }

  function createLayer(values, p) {

        let li = document.createElement('li');
        li.className = "list-group-item";
        let x = document.createElement('p');
        x.textContent = JSON.stringify(values);
        //convert to Jsonobject and then x.textContent
        console.log(x.value);
        li.appendChild(x);
        return li
    }

    function appendLayer(n) {
        let layerList = document.getElementById('rectangle');
        layerList.appendChild(n);
    }

loadLayer(p);

