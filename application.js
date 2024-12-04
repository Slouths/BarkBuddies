document.getElementById('adoptionForm').addEventListener('submit', function (event) {
    event.preventDefault(); // Prevent form from submitting the default way

    const applicationData = {
        applicantName: document.getElementById('name').value,
        email: document.getElementById('email').value,
        phone: document.getElementById('phone').value,
        address: document.getElementById('address').value,
        dog: { id: document.getElementById('dogId').value }
    };

    fetch('/api/applications/submit', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(applicationData),
    })
        .then(response => response.text())
        .then(message => alert(message))
        .catch(error => console.error('Error:', error));
});
