
  const languageSelect = document.getElementById('locale');

  function changeLocale() {
    languageSelect.addEventListener('change', function() {
    const selectedLang = locale.value;
    const url = new URL(window.location.href);// current URL
    const searchParams = url.searchParams;
    searchParams.set('lang', selectedLang);
    const modifiedURL = url.toString();
    window.location.href = modifiedURL;
      });

    getParams();

   }


  function getParams(){
     const url = new URL(window.location.href);
     const searchParams = url.searchParams;
     const currentLang = searchParams.get('lang');
     languageSelect.value = currentLang;
   }

changeLocale();


 function changeImg(){
   let header = document.querySelector('.header');
   const imgNL= document.getElementById('');
   const imgEN= document.getElementById('');
   let value = languageSelect.options[languageSelect.selectedIndex].value;
   if (value === 'nl') {
       header.appendChild(imgNL);
     } else if (value === 'en') {
       header.appendChild(imgEN);
 }

 }

 changeImg();


