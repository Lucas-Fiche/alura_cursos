#include <iostream>
using namespace std;

int main() {
    cout << "=======================" << endl;
    cout << "=  Bem-Vindo ao Jogo  =" << endl;
    cout << "=======================" << endl;

    int numero_secreto = 42;

    // cout << "O número secreto é "  << numero_secreto << ". Não conte para nínguem!" << endl; 

    int chute;  
    cout << "Qual o seu chute? ";
    cin >> chute;
    cout << "O valor do seu chute é " << chute << endl;

    if (chute == numero_secreto) {
        cout << "Você Acertou!" << endl;
    } else {
        if (chute > numero_secreto) {
            cout << "Chute um número mais baixo!" << endl;
        } else {
            cout << "Chute um número mais alto!" << endl;
        }
    }

}