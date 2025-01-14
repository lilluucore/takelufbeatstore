document.addEventListener('DOMContentLoaded', function() {
    const listenButtons = document.querySelectorAll('.listen-vk');

    listenButtons.forEach(button => {
        button.addEventListener('click', function() {
            const vkLink = 'https://vk.com/audio400210504_456246732_b3a61d8a7e5fec22fa';
            window.open(vkLink, '_blank');
        });
    });
});
