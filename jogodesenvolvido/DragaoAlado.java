
package jogodesenvolvido;


public class DragaoAlado extends Personagens {
    
    public void desenhar(){
    InOut.MsgDeInformacao("DRAGÃO:", """
                                                            ___, ____--'
                                                       _,-.'_,-'      (
                                                    ,-' _.-''....____(
                                          ,))_     /  ,'\\ `'-.     (          /\\
                                  __ ,+..a`  \\(_   ) /   \\    `'-..(         /  \\
                                  )`-;...,_   \\(_ ) /     \\  ('''    ;'^^`\\ <./\\.>
                                      ,_   )   |( )/   ,./^``_..._  < /^^\\ \\_.))
                                     `=;; (    (/_')-- -'^^`      ^^-.`_.-` >-'
                                     `=\\\\ (                             _,./
                                       ,\\`(                         )^^^
                                         ``;         __-'^^\\       /
                                           / _>emj^^^   `\\..`-.    ``'.
                                          / /               / /``'`; /
                                         / /          ,-=='-`=-'  / /
                                   ,-=='-`=-.               ,-=='-`=-.
                                 *******************************************""");
    }
    
    public void voar(){
    InOut.MsgDeInformacao("Voar:", "Dragão Voando magestosamente!!!!");
    }
    
    public void falar(){
    InOut.MsgDeInformacao("Falando:", "Roarrrrrrrrr!");
    }
    
    
    
    
}
