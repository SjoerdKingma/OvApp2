
  const languageSelect = document.getElementById('language-select');

  function changeLocale() {
    languageSelect.addEventListener('change', function() {
    console.log("hi");
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





