class Converter {
    double km;
    double kilocalories;

    double converterToKm(int sumSteps) {    //тут предлагали создать переменную steps, я не выкупил зачем, мне кажется как у меня легче
        km = sumSteps * 0.00075;            // вообще, тут просили сделать всё в int, но для этого пришлось бы заниаться парашей с переводом этих дибильных километро, мне кажется с одной строчко в double проще
        return km;
    }

    double convertStepsToKilocalories(int sumSteps) {    //тут та же параша с переменной steps
        kilocalories = sumSteps * 0.05;                  // тут тож сделал в дабле
        return kilocalories;
    }



}