package com.example.guitarlog;

import java.util.ArrayList;

public class GuitarData {

    public static String[][] data = new String[][]{
            {"Lakewood Sungha Jung Signature","Lakewood guitars are handmade German quality guitars, made by Martin Seeliger and his team. The craftsmanship of the Lakewood luthiers is evident not only in the flawless workmanship, but primarily in the sound of these guitars.", "6-string Acoustic-Electric Guitar", "Grand Concert\nSoft (round) Cutaway" , "European spruce Top\nIndian rosewood Back&Sides\nMahogany Neck", "650 mm (25.6 inch)\n20 frets", "L.R. Baggs Anthem", "Open-pored satin gloss (natural finish)","https://sc1.musik-produktiv.com/pic-010087741_02l/lakewood-sungha-jung-signature_02l.jpg"},
            {"Fender American Ultra Stratocaster", "American Ultra is our most advanced series of guitars and basses for discerning players who demand the ultimate in precision, performance and tone. The American Ultra Stratocaster features a unique “Modern D” neck profile with Ultra rolled fingerboard edges for hours of playing comfort, and the tapered neck heel allows easy access to the highest register.", "6-String Electric Guitar", "Stratocaster®", "Alder Body\nMaple Neck\nMaple Fingerboard", "25.5\" (648 mm)\n22 Frets", "Ultra Noiseless™ Vintage Strat®\n SSS Configuration","Gloss Polyurethane","https://www.fmicassets.com/Damroot/ZoomJpg/10001/0118012795_gtr_cntbdyright_001_nr.jpg"},
            {"Yamaha APX 700II", "The APX series not only changes in sound, each element turns into an easy switch for electric guitar players on stage, starting from the end designed for a cutaway body and a slim, electric guitar-style neck.", "6-String Acoustic-ELectric Guitar", "APX Shape", "Solid Spruce Top\nNato or Okume Back&Sides\nNato Neck", "650 mm (25 9/16”)", "SYSTEM64 + Pickup ART 1way", "Gloss Body Finish\n Matt Neck Finish","https://id.yamaha.com/id/files/APX600FMbanner_1200x480_b0f958fb5b6fd889671c5aa3cdd889b5.jpg"},
            {"Gibson Les Paul Tribute", "The Les Paul Tribute captures the vibe, feel and tonality of a traditional Les Paul and is available in four classic finishes. A rounded maple neck profile and ultra-modern weight relief make the Gibson Les Paul Studio Tribute a pleasure to play.", "6-String Electric Guitar", "Les Paul", "Mahogany Body\nMaple Top & Neck\n Rosewood Fingerboard", "24.75\" / 62.865cm\n22 Frets", "490R Neck Pickup\n490T Bridge Pickup", "Satin Nitrocellulose Lacquer","https://static.gibson.com/product-images/USA/USAANM97/Satin%20Iced%20Tea/beauty-1600_900.png"},
            {"Alvarez AC65", "Alvarez uses traditional style construction for its classical guitars, incorporating a Spanish heel neck joint and tapered fan bracing to deliver stability, balance and volume across all six strings. The Artist 65’s are very responsive guitars with a warm and open voice.", "Nylon Guitar", "Classical", "Solid A+ Western Red Cedar Top\nMahogany Back, Sides, & Neck", "25 19/32\"\n19 Frets", "-","Natural Gloss Top Finish\n50/50 Semi gloss finish Neck","https://www.alvarezguitars.com/wp-content/uploads/2014/01/AC65-Front-3_4-1.jpg"},
            {"Cort M-Jet", "Hugh Manson has been making custom guitars for over 30 years and has earned an enviable reputation within the music industry for innovation and quality, making electric guitars for some of the world's best known rock & roll superstars, including John Paul Jones from Led Zeppelin and Matt Bellamy from Muse. We are pleased to announce the 2017 collaboration project with Manson Guitar Works new electric guitar model M-Jet.", "6-String Electric Guitar", "Telecaster", "American Basswood Body\nCanadian Hard Maple Neck\nJatoba (Compound Radius) Fretboard", "648㎜ (25.5\")\n24 Frets", "Manson® Humbucker Pickups", "Matt Black Finish","https://www.mansonguitarworks.com/assets/images/shop/products/additional/product_365/large_9DBC043E-06C3-ECB2-16F0090753BD29D4.jpg"},
            {"Takamine EF381SC", "The EF381SC 12-string dreadnought is handcrafted in our pro series facility that has been building precision quality instruments over five decades. The versatility of this guitar begins with its solid spruce top that can play sweet mellow passages or power chords with equal ability.", "12-String Acoustic-Electric Guitar", "Dreadnought\nCutaway", "Solid Spruce Top\nLaminated Maple Back&Sides\nMahogany Neck", "24” Inch", "CT4B II preamp system", "Black","https://www.pourlesmusiciens.com/medias/375/takamine-ef381sc-12-string-legacy-dreadnought-cw-12-cordes-epicea-erable-ct4bii-large-7-91853.png"},
            {"Ibanez RG2027XL Prestige", "There are three principles behind our new Ibanez Prestige line: Precision, Performance, and Playability. The combination of high-tech manufacturing techniques with old-world Japanese craftsmanship, true innovation in design and construction, and the incorporation of ideas and suggestions from musicians from around the world are the cornerstones of the Prestige production process.", "7-String Electric Guitar", "Super Strat", "Maple/Wenge Neck\nBasswood Body\nBound Macassar Ebony Fretboard", "686mm/27\"\n24 Frets", "DiMarzio® Fusion Edge 7 HH Pickups", "Cosmo black","https://www.web4music.com/upload/musicworks_resize/2510015091331_3_1200.jpg"},
            {"Taylor 224ce-K DLX", "Fans of Hawaiian koa will love the look, feel and sound of this all-koa Grand Auditorium. A shaded edgeburst elevates the vintage appeal of the solid koa top, which is paired with layered koa back and sides, while a gloss finish wraps the body in a rich sheen.", "6-String Acoustic Guitar", "Grand Auditorium\nVenetian Cutaway", "Hawaiian Koa Top\nLayered Koa Body\nWest African Ebony Neck", "25-1/2\"\n20 Frets", "-", "Satin Neck Finish\nGloss Body Finish","https://www.taylorguitars.com/sites/default/files/styles/related_guitars_module/public/responsive-guitar-detail/Taylor-224ce-K-DLX-fr-2019_0.png?itok=TQXC7xZA"},
            {"PRS Sliver Sky", "The PRS Silver Sky is the result of a close collaboration between Grammy Award-winning musician John Mayer and Paul Reed Smith. Years of development led to this vintage-inspired model, based off Mayer and Smith’s favorite elements of 1963 and 1964 instruments", "6-String Electric Guitar", "Stratocaster", " Alder Body\nMaple Neck\nRosewood Fretboard", "25.5\"\n22 Frets", "635JM SSS Pickup", "Silver Sky","https://kishidatomohiro.com/ebay/wp-content/uploads/2018/11/629e5e97bb40dc40a77a2414aa76ae57ae13ce.jpg"}
    };


    public static ArrayList<Guitar> getListData() {
        ArrayList<Guitar> list = new ArrayList<>();
        for (String[] aData : data) {
            Guitar guitar = new Guitar();
            guitar.setName(aData[0]);
            guitar.setDetail(aData[1]);
            guitar.setType(aData[2]);
            guitar.setShape(aData[3]);
            guitar.setMaterial(aData[4]);
            guitar.setScale(aData[5]);
            guitar.setPickup(aData[6]);
            guitar.setFinish(aData[7]);
            guitar.setPhoto(aData[8]);

            list.add(guitar);
        }
        return list;
    }
}
