

  const addButton = document.getElementById('addFavourite');
  const fromValue = document.getElementById('van');
  const toValue = document.getElementById('naar');
  var inputValues =[];
const values = { 'From': fromValue.value, 'To': toValue.value }; // add if/else if there are already values in localStorage.
  function addFavourite(){

       addButton.addEventListener('click', function(){
//       localStorage.clear();
       const values = { 'From': fromValue.value, 'To': toValue.value }; // add if/else if there are already values in localStorage.
       console.log(values);
       inputValues.push(values);
       localStorage.setItem('inputValues', JSON.stringify(inputValues));
       console.log(localStorage);
    });
  }

   addFavourite();


  function loadLayer() {

        let p = JSON.parse(window.localStorage.getItem('inputValues'));
        for (let i = 0; i < p.length; i++) {
            let n  = createLayer(p[i])
            appendLayer(n)
          }
      }

  function createLayer(values) {

        let li = document.createElement('li');
        li.className = "list-group-item"
        let x = document.createElement('p');
//        x.setAttribute("value", values);
       x.textContent = values;
        li.appendChild(x);
        return li
    }

    function appendLayer(n) {
        let layerList = document.getElementById('rectangle');
        layerList.appendChild(n);
    }

    loadLayer()

//
//function showFavourites(){
//     const ulFav = document.getElementById('rectangle');
//     var inputValues = JSON.parse(localStorage.getItem('inputValues'));
//     if(inputValues>0){
//        inputValues.forEach((value) => {
//        const liFav = document.createElement('li');
//        liFav.setAttribute("id","liValue");
////         const spanFav = document.createElement('span');
//         const pFav = document.createElement('p');
//        //add from and to texts from resource Bundle.
//        pFav.textContent = value;
//        console.log(pFav.textContent);
//        liFav.appendChild(pFav)
//        ulFav.appendChild(liFav);
//    });
//   }
// }
//
//
//showFavourites();

//function chooseFromFavourites(){
//  const ulFav = document.getElementById('liValue');
//  ulFav.addEventListener('click' ,function(){
//  fromValue.append(fromValue.value);
//  toValue.textContent +=toValue.value;
//  fromValue.textContent += fromValue.value;
//  toValue.append(toValue.value);// or use textContent
//
//  })
//}