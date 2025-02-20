# 📱 Modelando iPhone com UML: Música, Chamada e Internet  

Este projeto modela um **iPhone** utilizando UML e implementa suas funcionalidades em **Java**. Ele segue os princípios da **Programação Orientada a Objetos (POO)**, utilizando **herança** e **interfaces** para estruturar um sistema modular e reutilizável.  

## 📌 Visão Geral  

O projeto tem como objetivo representar um iPhone com três funcionalidades principais:  

- 🎵 **Reprodutor Musical**: Tocar, pausar, selecionar músicas e ajustar volume.  
- 📞 **Aparelho Telefônico**: Realizar chamadas, atender, gravar números e acessar correio de voz.  
- 🌐 **Navegador de Internet**: Exibir páginas, abrir novas abas, atualizar e baixar arquivos.  

## 🖼️ Diagrama UML  

O diagrama UML abaixo ilustra a estrutura do projeto, destacando a relação entre classes e interfaces:  

![Diagrama UML](./Captura_de_ecra_2024-07-10_142432.png)  


### 🔹 Interfaces  

- **`ReprodutorMusical`**: Define os métodos para reprodução de música.  
- **`AparelhoTelefonico`**: Responsável pelas funcionalidades de chamadas.  
- **`NavegadorInternet`**: Define operações para navegação na internet.  

### 🔹 Classes  

- **`Ipod`**: Implementa `ReprodutorMusical`, permitindo a reprodução de músicas.  
- **`Iphone`**: Implementa todas as interfaces (`ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`), reunindo todas as funcionalidades em um único dispositivo.  
- **`Main`**: Classe principal para testar as funcionalidades do iPhone.  



