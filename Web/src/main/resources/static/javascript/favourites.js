

  const addButton = document.getElementById('addFavourite');
  const fromValue = document.getElementById('van');
  const toValue = document.getElementById('naar');
  var inputValues =[];

  function addFavourite(){

       addButton.addEventListener('click', function(){


       var inputValues = JSON.parse(localStorage.getItem('inputValues'));
       const value = { "From": fromValue.value, "To": toValue.value };
       inputValues.push(value);
       localStorage.setItem('inputValues', JSON.stringify(inputValues));
       console.log(localStorage);
    });
  }

  addFavourite();



