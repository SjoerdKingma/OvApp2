
  const languageSelect = document.getElementById('language-select');
  let url = new URL(window.location.href);// current URL
  const searchParams = url.searchParams;

  function changeLocale() {
      languageSelect.addEventListener('change', function() {
         const selectedLang = languageSelect.value;
         searchParams.set('lang', selectedLang);
         const modifiedURL = url.toString();
         window.location.href = modifiedURL;
    });
    getParams();
 }

  function getParams(){
     const currentLang = searchParams.get('lang');
     languageSelect.value = currentLang;
   }

changeLocale();





