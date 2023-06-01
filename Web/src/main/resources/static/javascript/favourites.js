

  const addButton = document.getElementById('addFavourite');
  var fromValue = document.getElementById('van').value;
  var toValue = document.getElementById('naar').value;


  function addFavourite(){

   addButton.addEventListener('click', function(){

//     e.preventDefault();    //stop form from submitting

    console.log("Add Favorite button clicked");

       var inputValues = JSON.parse(localStorage.getItem('inputValues')) || [];

       var value = {
        "From": fromValue,
         "To": toValue
       };

       inputValues.push(value);

       localStorage.setItem('inputValues', JSON.stringify(inputValues));

      console.log(value);

                // Clear the form inputs
//        document.getElementById('van').value = '';
//         document.getElementById('naar').value = '';


    });
  }

  addFavourite();


  function showFavourites(){
  favoritesList.innerHTML = '';
  var inputValues = JSON.parse(localStorage.getItem('inputValues')) || [];
   if (inputValues.length > 0) {
              inputValues.forEach((value) => {
                  const listItem = document.createElement('li');
                  listItem.classList.add('list-group-item', 'd-flex', 'justify-content-between', 'align-items-center');
                  listItem.innerHTML = `
                      <span>${product.name} - €${product.price.toFixed(2)}</span>
                      <button type="button" class="btn btn-sm btn-danger delete-button" data-index="${index}">
                          <i class="bi bi-trash"></i>
                      </button>
                  `;
                  favoritesList.appendChild(listItem);
              });

              const deleteButtons = favoritesList.querySelectorAll('.delete-button');
              deleteButtons.forEach((button) => {
                  button.addEventListener('click', deleteFavourite());
                  )};
    } else {
              const message = document.createElement('p');
              message.classList.add('text-center');
              message.textContent = 'You have no favorites yet.';
              favoritesList.appendChild(message);
          }
  }

 function deleteFavourite(){
         const index = event.target.dataset.index;
         inputValues.splice(index, 1);
         localStorage.setItem('inputValues', JSON.stringify(inputValues));

 }





