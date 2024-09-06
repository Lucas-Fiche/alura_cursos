#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main() {
    cout << "=======================" << endl;
    cout << "=  Bem-Vindo ao Jogo  =" << endl;
    cout << "=======================" << endl;

    cout << "Escolha o seu nível de dificuldade: " << endl;
    cout << "Fácil (F), Médio (M) ou Difícil (D)" << endl;

    char dificuldade;

    cin >> dificuldade;

    int numero_tentativas;

    if (dificuldade == 'F') {
        numero_tentativas = 15;
    } else if (dificuldade == 'M') {
        numero_tentativas = 10;
    } else {
        numero_tentativas = 5;
    }

    srand(time(NULL));
    const int NUMERO_SECRETO = rand() % 100; 

    bool nao_acertou = true;
    int tentativas = 0;
    double pontos = 1000.0;

    for (tentativas = 1; tentativas <= numero_tentativas; tentativas++) {
        int chute;  
        cout << "Tentativa: " << tentativas << endl;
        cout << "Qual o seu chute? ";
        cin >> chute;

        double pontos_perdidos = abs((chute - NUMERO_SECRETO)/2.0);
        pontos -= pontos_perdidos;

        cout << "O valor do seu chute é " << chute << endl;

        bool acertou = chute == NUMERO_SECRETO;
        bool maior = chute > NUMERO_SECRETO;

        if (acertou) {
            cout << "Parabéns! Você Acertou!" << endl;
            nao_acertou = false;
            break;
        } else {
            if (maior) {
                cout << "Chute um número mais baixo!" << endl;
            } else {
                cout << "Chute um número mais alto!" << endl;
            }
        } 
    }

    cout << "Fim de Jogo" << endl;

    if (nao_acertou) {
        cout << "Você Perdeu! Tente novamente!" << endl;
    } else{
        cout << "Você acertou em " << tentativas << " tentativas!" << endl;
        cout.precision(2);
        cout << fixed;
        cout << "Sua pontuação foi de " << pontos << endl;
    }
    
}