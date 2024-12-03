function navigateTo(section) {
  
    document.getElementById('home-section').style.display = 'none';
    document.getElementById('adoption-section').style.display = 'none';
    document.getElementById('donation-section').style.display = 'none';

   
    document.getElementById(`${section}-section`).style.display = 'block';
}

function logout() {
   
    alert('You have been logged out.');
    window.location.href = 'login.html'; // Example redirection to login page
}
