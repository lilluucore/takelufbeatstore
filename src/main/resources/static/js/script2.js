document.querySelector('.write-to-buy').addEventListener('click', function() {
    document.getElementById('contactPopup').style.display = 'block';
});

document.getElementById('contactForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const button = event.target.querySelector('button');
    button.disabled = true;
    button.style.backgroundColor = '#ddd';

    setTimeout(function() {
        button.style.backgroundColor = '#4caf50'; // Зеленый цвет
        setTimeout(function() {
            document.getElementById('contactPopup').style.display = 'none';
            button.disabled = false;
            button.style.backgroundColor = '#fff';
        }, 2000);
    }, 2000);
});
