

  const addButton = document.getElementById('new-button');
  //  var fromValue = document.getElementById('van').value;
  //  var toValue = document.getElementById('naar').value;


  function addFavourite(){

   addButton.addEventListener('click', function(){
   //    e.preventDefault();    //stop form from submitting

   //    event.preventDefault();
   ////    event.stopPropagation()
    console.log("Add Favorite button clicked");

    //   var inputValues = JSON.parse(localStorage.getItem('inputValues')) || [];
    //
    //   var values = {
    //    "From": fromValue,
    //     "To": toValue
    //   };
    //
    //   inputValues.push(values);
    //
    //   localStorage.setItem('inputValues', JSON.stringify(inputValues));
    //
    //            // Clear the form inputs
    //    document.getElementById('van').value = '';
    //     document.getElementById('naar').value = '';
    //
    // addButton.addEventListener('click', saveFavourite);
    });
  }

  addFavourite();







