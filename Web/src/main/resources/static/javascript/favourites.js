

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

//function showFavourites(){
//
//     const ulFav = document.getElementById('rectangle');
//     var inputValues = JSON.parse(localStorage.getItem('inputValues'));
//     if(inputValues>0){
//        inputValues.forEach((value) => {
//        const liFav = document.createElement('li');
//        //add from and to texts from resource Bundle.
//        liFav.textContent += "From": fromValue.value,"To:",toValue.value;
//        const pFav = document.createElement('p');
//        const spanFav = document.createElement('span');
//        pFav.appendChild(spanFav);
//        ulFav.appendChild(liFav);
//    });
//   }
// }
//
//
//showFavourites();

function chooseFromFavourits(){
  const ulFav = document.getElementById('li');
  ulFav.addEventListener('click' ,function(){
  fromValue.append(fromValue.value);
  toValue.append(toValue.value);// or use textContent


  })




}