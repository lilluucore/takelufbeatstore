document.querySelectorAll('.triangle, .out-now-content').forEach(function(element) {
    element.addEventListener('click', function() {
        const popupId = this.getAttribute('data-popup');
        document.getElementById(popupId).style.display = 'block';
        document.querySelector('.dark-background').style.display = 'block';
    });
});

document.querySelectorAll('.popup').forEach(function(popup) {
    popup.addEventListener('click', function(event) {
        if (event.target === this) {
            this.style.display = 'none';
            document.querySelector('.dark-background').style.display = 'none';
        }
    });
});

document.querySelector('.dark-background').addEventListener('click', function() {
    document.querySelectorAll('.popup').forEach(function(popup) {
        popup.style.display = 'none';
    });
    this.style.display = 'none';
});

document.querySelectorAll('.listen-vk').forEach(function(button) {
    button.addEventListener('click', function(event) {
        event.stopPropagation(); // Предотвращаем всплытие события
        const vkLink = this.closest('.beat-card').getAttribute('data-vk-link');
        window.open(vkLink, '_blank');
    });
});

document.querySelectorAll('.beat-card').forEach(function(card) {
    card.addEventListener('click', function() {
        const vkLink = this.getAttribute('data-vk-link');
        window.open(vkLink, '_blank');
    });
});

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
