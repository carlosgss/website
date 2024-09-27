document.getElementById('contact-form').addEventListener('submit', function(event) {
    event.preventDefault(); // Impede o envio padrão do formulário

    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const message = document.getElementById('message').value;

    // Simulando o envio de dados
    if (name && email && message) {
        document.getElementById('response-message').innerText = 'Mensagem enviada com sucesso!';
        document.getElementById('contact-form').reset(); // Limpa o formulário
    } else {
        document.getElementById('response-message').innerText = 'Por favor, preencha todos os campos.';
    }
});
