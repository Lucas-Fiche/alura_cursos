#include <iostream>
#include <string>
using namespace std;

const string PALAVRA_SECRETA = "CARRO";

bool letra_existe(char chute){
    // for (int i = 0; i < PALAVRA_SECRETA.size(); i++){
    //     if (chute == PALAVRA_SECRETA[i]) {
    //         return true;
    //     }
    // }
    // return false;

    for(char letra : PALAVRA_SECRETA){
        if (chute == letra){
            return true;
        }
    }
    return false;
}

int main(){

    cout << PALAVRA_SECRETA << endl;

    bool nao_enforcou = true;
    bool nao_acertou = true;
    while(nao_acertou && nao_enforcou){
        char chute;
        cin >> chute;

        if (letra_existe(chute)){
            cout << "Seu chute está na palavra!" << endl;
        } else {
            cout << "Errou! Seu chute não está na palavra." << endl;
        }
    }

    return 0;
}