function filterDogs() {
    const breed = document.getElementById('breed').value;

    fetch(`/api/dogs/filter?breed=${breed}`)
        .then(response => response.json())
        .then(data => displayDogs(data))
        .catch(error => console.error('Error:', error));
}

function displayDogs(dogs) {
    const dogList = document.getElementById('dog-list');
    dogList.innerHTML = '';

    if (dogs.length === 0) {
        dogList.innerHTML = '<p>No dogs found for this breed.</p>';
        return;
    }

    dogs.forEach(dog => {
        const dogItem = document.createElement('div');
        dogItem.innerHTML = `
            <h3>${dog.name}</h3>
            <p>Breed: ${dog.breed}</p>
            <p>Age: ${dog.age}</p>
            <p>Size: ${dog.size}</p>
        `;
        dogList.appendChild(dogItem);
    });
}

function logout() {
    window.location.href = '/login';
}
