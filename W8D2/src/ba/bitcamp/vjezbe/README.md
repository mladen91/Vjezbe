SNAKE igra

Projekat se sastoji iz tri klase. Prva klasa obuhvata Single Player mod, druga Multiplayer, a tre�a predstavlja main klasu u kojoj se odlu�uje koji mod �elimo igrati.

U oba moda "Snake" predstavlja niz x i y koordinata. Kretnja zmije se vr�i pomo�u tipki na tastaturi "UP","DOWN","LEFT","RIGHT", a u multiplayer modu igra� dva se kre�e pomo�u tipki "W","A","S","D". Nakon �to zmija pokupi hranu, na tabli se generi�e nova hrana pomo�u math random funkcije. Detaljniji opis svih metoda mo�e se vidjeti kroz Javadoc.

Cilj Single Player moda jeste da igra� skupi �to ve�i broj bodova kupe�i "hranu" sa plo�e. Brzina kretanja zmije se pove�ava svako 10 skupljenih kvadrati�a koji predstavljaju hranu. Kraj igre nastaje kada zmija udari u krajeve plo�e ili kada udari u samu sebe.

Cilj Multiplayer moda obuhvata skupljanje �to ve�eg broja bodova kupe�i hranu sa plo�e(svaka skupljena nosi 10 bodova). Me�utim, pored toga �to je bitno skupiti �to ve�i broj, jednako je va�no ne udariti u zid ili u drugu zmiju. Ukoliko igra� 1 ima ve�i broj bodova, a izazove "crash" rezultat �e biti nerije�en. U suprotnom igra� 1 je izgubio. Va�no je i napomenuti da svaka peta skupljena hrana nosi po 25 bodova, te omogu�uje igra�u koji je u zaostatku da stigne protivnika.