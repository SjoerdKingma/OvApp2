
  const languageSelect = document.getElementById('language-select');

  function changeLocale() {
    languageSelect.addEventListener('change', function() {
    const selectedLang = languageSelect.value;
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
   const header = document.querySelector('.header');
   const imgNL= document.getElementById('image-nl');
   const imgEN= document.getElementById('image-en');
   const imageOptions = document.getElementById('language-options');
   const value = languageSelect.options[languageSelect.selectedIndex].value;
   if (value === 'nl') {
       imageOptions.appendChild(imgNL);
       imageOptions.removeChild(imgEN);
     } else if (value === 'en') {
       imageOptions.appendChild(imgEN);
       imageOptions.removeChild(imgNL);
 }

 }

 changeImg();


