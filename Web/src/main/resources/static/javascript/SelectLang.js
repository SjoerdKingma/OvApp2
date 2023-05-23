


  function changeLocale() {

   const languageSelect = document.getElementById('locale');
   languageSelect.addEventListener('change', function() {
   const selectedLang = locale.value;
   const url = new URL(window.location.href);// current URL
   const searchParams = url.searchParams;
   searchParams.set('lang', selectedLang);
   const modifiedURL = url.toString();
   window.location.href = modifiedURL;
   });
   const url = new URL(window.location.href);
   const searchParams = url.searchParams;
   const currentLang = searchParams.get('lang');
   languageSelect.value = currentLang;

   }

changeLocale();

