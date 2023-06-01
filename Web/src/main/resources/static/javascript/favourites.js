

  const addButton = document.getElementById('addFavourite');
  var fromValue = document.getElementById('van');
  var toValue = document.getElementById('naar');

  function addFavourite(){

   addButton.addEventListener('click', function(){

//     e.preventDefault();    //stop form from submitting

    console.log("Add Favorite button clicked");

       var inputValues = JSON.parse(localStorage.getItem('inputValues')) || [];

       var value = {
        "From": fromValue.value,
         "To": toValue.value
       };

       inputValues.push(value);

       localStorage.setItem('inputValues', JSON.stringify(inputValues));

       console.log(localStorage);

                // Clear the form inputs
       document.getElementById('van').value = '';
       document.getElementById('naar').value = '';

    });
  }

  addFavourite();


