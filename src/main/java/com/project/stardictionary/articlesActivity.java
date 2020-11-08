package com.project.stardictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class articlesActivity extends AppCompatActivity {
    public void showValue(String value)
    {
        TextView ttxt=(TextView) findViewById(R.id.textID);
        ImageView img=(ImageView) findViewById(R.id.imageID);
        String temp;
        if(value.equals("Mercury"))
        {
            temp="Mercury is the smallest and innermost planet in the Solar System. Its orbital period around the Sun of 87.97 " +
                    "days is the shortest of all the planets in the Solar System. It is named after the Roman deity Mercury, " +
                    "the messenger of the gods.\n" +
                    "\n" +
                    "Like Venus, Mercury orbits the Sun within Earth's orbit as an inferior planet, " +
                    "and never exceeds 28° away from the Sun. When viewed from Earth, this proximity to the Sun" +
                    " means the planet can only be seen near the western or eastern horizon during the early evening or" +
                    " early morning. At this time it may appear as a bright star-like object, but is often far more difficult " +
                    "to observe than Venus. The planet telescopically displays the complete range of phases, similar to Venus and " +
                    "the Moon, as it moves in its inner orbit relative to Earth, which reoccurs over the so-called synodic period " +
                    "approximately every 116 days.";
            ttxt.setText(temp);
            img.setImageResource(R.drawable.marcury);


        }
        else if(value.equals("Venus"))
        {
            temp="Venus is the second planet from the Sun, orbiting it every 224.7 Earth days.[12] It has the longest rotation period " +
                    "(243 days) of any planet in the Solar System and rotates in the opposite direction to most other planets " +
                    "(meaning the Sun would rise in the west and set in the east).It does not have any natural satellites. " +
                    "It is named after the Roman goddess of love and beauty. It is the second-brightest natural object in" +
                    " the night sky after the Moon, reaching an apparent magnitude of −4.6 – bright enough to cast shadows at " +
                    "night and, rarely, visible to the naked eye in broad daylight.Orbiting within Earth's orbit, Venus is an " +
                    "inferior planet and never appears to venture far from the Sun; its maximum angular distance from the Sun " +
                    "(elongation) is 47.8°.\n" +
                    "\n" +
                    "Venus is a terrestrial planet and is sometimes called Earth's \"sister planet\" because of their " +
                    "similar size, mass, proximity to the Sun, and bulk composition. It is radically different from Earth " +
                    "in other respects. It has the densest atmosphere of the four terrestrial planets, consisting of more than " +
                    "96% carbon dioxide. The atmospheric pressure at the planet's surface is 92 times that of Earth, or roughly t" +
                    "he pressure found 900 m (3,000 ft) underwater on Earth.";
            ttxt.setText(temp);
            img.setImageResource(R.drawable.venus);
        }
        else if(value.equals("Mars"))
        {
            temp="Mars is the fourth planet from the Sun and the second-smallest planet in the Solar System after Mercury. " +
                    "In English, Mars carries a name of the Roman god of war, and is often referred to as the \"Red Planet\"" +
                    "because the reddish iron oxide prevalent on its surface gives it a reddish appearance that is distinctive" +
                    " among the astronomical bodies visible to the naked eye.[16] Mars is a terrestrial planet with a thin " +
                    "atmosphere, having surface features reminiscent both of the impact craters of the Moon and the valleys, " +
                    "deserts, and polar ice caps of Earth.\n" +
                    "\n" +
                    "The rotational period and seasonal cycles of Mars are likewise similar to those of Earth, as is the tilt" +
                    " that produces the seasons. Mars is the site of Olympus Mons, the largest volcano and second-highest known" +
                    " mountain in the Solar System, and of Valles Marineris, one of the largest canyons in the Solar System. " +
                    "The smooth Borealis basin in the northern hemisphere covers 40% of the planet and may be a giant impact " +
                    "feature. Mars has two moons, Phobos and Deimos, which are small and irregularly shaped." +
                    " These may be captured asteroids,[19][20] similar to 5261 Eureka, a Mars trojan.";
            ttxt.setText(temp);
            img.setImageResource(R.drawable.mars);

        }
        else if(value.equals("Earth"))
        {
            temp="Earth is the third planet from the Sun and the only astronomical object known to harbor life. " +
                    "According to radiometric dating and other sources of evidence, Earth formed over 4.5 billion years ago." +
                    "Earth's gravity interacts with other objects in space, especially the Sun and the Moon, " +
                    "Earth's only natural satellite. Earth revolves around the Sun in 365.26 days, a period known as an Earth year. During this time, Earth rotates about its axis about 366.26 times.[n 5]\n" +
                    "\n" +
                    "Earth's axis of rotation is tilted with respect to its orbital plane," +
                    " producing seasons on Earth.The gravitational interaction between Earth and the Moon causes " +
                    "ocean tides, stabilizes Earth's orientation on its axis, and gradually slows its rotation." +
                    "Earth is the densest planet in the Solar System and the largest of the four terrestrial planets.";
            ttxt.setText(temp);
            img.setImageResource(R.drawable.earth);

        }
        else if(value.equals("Jupiter"))
        {
            temp="Jupiter is the fifth planet from the Sun and the largest in the Solar System. It is a giant planet with " +
                    "a mass one-thousandth that of the Sun, but two-and-a-half times that of all the other planets in the" +
                    " Solar System combined. Jupiter and Saturn are gas giants; the other two giant planets, Uranus and Neptune, " +
                    "are ice giants. Jupiter has been known to astronomers since antiquity. The Romans named it after their " +
                    "god Jupiter.[15] When viewed from Earth, Jupiter can reach an apparent magnitude of −2.94, bright enough " +
                    "for its reflected light to cast shadows, and making it on average the third-brightest natural object " +
                    "in the night sky after the Moon and Venus.\n" +
                    "\n" +
                    "Jupiter is primarily composed of hydrogen with a quarter of its mass being helium, though helium " +
                    "comprises only about a tenth of the number of molecules. It may also have a rocky core of heavier " +
                    "elements, but like the other giant planets, Jupiter lacks a well-defined solid surface.";
            ttxt.setText(temp);
            img.setImageResource(R.drawable.jupiter);

        }
        else if(value.equals("Saturn"))
        {
            temp="Saturn is the sixth planet from the Sun and the second-largest in the Solar System, after Jupiter." +
                    " It is a gas giant with an average radius about nine times that of Earth." +
                    " It has only one-eighth the average density of Earth, but with its larger volume Saturn is over" +
                    " 95 times more massive. Saturn is named after the Roman god of agriculture; its astronomical symbol (♄)" +
                    " represents the god's sickle.\n" +
                    "\n" +
                    "Saturn's interior is probably composed of a core of iron–nickel and rock (silicon and oxygen compounds)." +
                    " This core is surrounded by a deep layer of metallic hydrogen, an intermediate layer of liquid hydrogen " +
                    "and liquid helium, and finally a gaseous outer layer. Saturn has a pale yellow hue due to ammonia crystals" +
                    " in its upper atmosphere. Electrical current within the metallic hydrogen layer is thought to give rise to" +
                    " Saturn's planetary magnetic field, which is weaker than Earth's, but has a magnetic moment 580 times " +
                    "that of Earth due to Saturn's larger size. Saturn's magnetic field strength is around one-twentieth of " +
                    "Jupiter's. The outer atmosphere is generally bland and lacking in contrast, although long-lived " +
                    "features can appear. Wind speeds on Saturn can reach 1,800 km/h (1,100 mph; 500 m/s), higher than " +
                    "on Jupiter, but not as high as those on Neptune.";
            ttxt.setText(temp);
            img.setImageResource(R.drawable.saturn);

        }
        else if(value.equals("Neptune"))
        {
            temp="Neptune is the eighth and farthest known planet from the Sun in the Solar System." +
                    " In the Solar System, it is the fourth-largest planet by diameter, the third-most-massive planet," +
                    " and the densest giant planet. Neptune is 17 times the mass of Earth and is slightly more massive than" +
                    " its near-twin Uranus, which is 15 times the mass of Earth and slightly larger than Neptune." +
                    " Neptune orbits the Sun once every 164.8 years at an average distance of 30.1 AU (4.5 billion km). " +
                    "It is named after the Roman god of the sea and has the astronomical symbol ♆, a stylised version " +
                    "of the god Neptune's trident.\n" +
                    "\n" +
                    "Neptune is not visible to the unaided eye and is the only planet in the Solar System " +
                    "found by mathematical prediction rather than by empirical observation. Unexpected changes" +
                    " in the orbit of Uranus led Alexis Bouvard to deduce that its orbit was subject to gravitational" +
                    " perturbation by an unknown planet. Neptune was subsequently observed with a telescope on 23 September " +
                    "1846 by Johann Galle within a degree of the position predicted by Urbain Le Verrier. Its largest moon, " +
                    "Triton, was discovered shortly thereafter, though none of the planet's remaining known 13 moons were " +
                    "located telescopically until the 20th century. The planet's distance from Earth gives it a very small" +
                    " apparent size, making it challenging to study with Earth-based telescopes." +
                    " Neptune was visited by Voyager 2, when it flew by the planet on 25 August 1989.";
            ttxt.setText(temp);
            img.setImageResource(R.drawable.neptune);

        }
        else if(value.equals("Moon"))
        {
            temp="The Moon is an astronomical body that orbits planet Earth and is Earth's only permanent natural satellite. " +
                    "It is the fifth-largest natural satellite in the Solar System, and the largest among planetary " +
                    "satellites relative to the size of the planet that it orbits (its primary). The Moon is after Jupiter's " +
                    "satellite Io the second-densest satellite in the Solar System among those whose densities are known.\n" +
                    "\n" +
                    "The Moon is thought to have formed about 4.51 billion years ago, not long after Earth." +
                    " The most widely accepted explanation is that the Moon formed from the debris left over after a giant" +
                    " impact between Earth and a Mars-sized body called Theia.\n" +
                    "\n" +
                    "The Moon is in synchronous rotation with Earth, and thus always shows the same side to earth," +
                    " the near side. The near side is marked by dark volcanic maria that fill the spaces between" +
                    " the bright ancient crustal highlands and the prominent impact craters. After the Sun, the Moon " +
                    "is the second-brightest regularly visible celestial object in Earth's sky. Its surface is actually " +
                    "dark, although compared to the night sky it appears very bright, with a reflectance just slightly" +
                    " higher than that of worn asphalt. Its gravitational influence produces the ocean tides, body tides," +
                    " and the slight lengthening of the day.\n" +
                    "\n" +
                    "The Moon's average orbital distance is 384,402 km (238,856 mi), or 1.28 light-seconds. " +
                    "This is about thirty times the diameter of Earth. The Moon's apparent size in the sky " +
                    "is almost the same as that of the Sun (because it is 400x farther and larger). Therefore, " +
                    "the Moon covers the Sun nearly precisely during a total solar eclipse. This matching of " +
                    "apparent visual size will not continue in the far future, because the Moon's distance from Earth is " +
                    "slowly increasing.";
            ttxt.setText(temp);
            img.setImageResource(R.drawable.moon);

        }
        else if(value.equals("Sun"))
        {
            temp="The Sun is the star at the center of the Solar System. It is a nearly perfect sphere of hot plasma," +
                    " with internal convective motion that generates a magnetic field via a dynamo process." +
                    "It is by far the most important source of energy for life on Earth. Its diameter is about 1.39 million" +
                    " kilometers, i.e. 109 times that of Earth, and its mass is about 330,000 times that of Earth, accounting" +
                    " for about 99.86% of the total mass of the Solar System. About three quarters of the Sun's mass " +
                    "consists of hydrogen (~73%); the rest is mostly helium (~25%), with much smaller quantities of heavier " +
                    "elements, including oxygen, carbon, neon, and iron.\n" +
                    "\n" +
                    "The Sun is a G-type main-sequence star (G2V) based on its spectral class. As such, " +
                    "it is informally and not completely accurately referred to as a yellow dwarf (its light is closer " +
                    "to white than yellow). It formed approximately 4.6 billion years ago from the gravitational" +
                    " collapse of matter within a region of a large molecular cloud. Most of this matter gathered in the center," +
                    " whereas the rest flattened into an orbiting disk that became the Solar System. " +
                    "The central mass became so hot and dense that it eventually initiated nuclear fusion in its core. " +
                    "It is thought that almost all stars form by this process.";
            ttxt.setText(temp);
            img.setImageResource(R.drawable.sun);

        }
        else if(value.equals("Uranus"))
        {
            temp="Uranus is the seventh planet from the Sun. It has the third-largest planetary radius and fourth-largest" +
                    " planetary mass in the Solar System. Uranus is similar in composition to Neptune, and both have" +
                    " different bulk chemical composition from that of the larger gas giants Jupiter and Saturn. For this" +
                    " reason, scientists often classify Uranus and Neptune as \"ice giants\" to distinguish them from the" +
                    " gas giants. Uranus's atmosphere is similar to Jupiter's and Saturn's in its primary composition of " +
                    "hydrogen and helium, but it contains more \"ices\" such as water, ammonia, and methane, along with traces" +
                    " of other hydrocarbons.It is the coldest planetary atmosphere in the Solar System, with a minimum " +
                    "temperature of 49 K (−224 °C; −371 °F), and has a complex, layered cloud structure with water thought" +
                    " to make up the lowest clouds and methane the uppermost layer of clouds. The interior of Uranus " +
                    "is mainly composed of ices and rock.\n" +
                    "\n" +
                    "Like the other giant planets, Uranus has a ring system, a magnetosphere, and numerous moons." +
                    " The Uranian system has a unique configuration among those of the planets because its axis of " +
                    "rotation is tilted sideways, nearly into the plane of its solar orbit. Its north and south poles," +
                    " therefore, lie where most other planets have their equators. In 1986, images from Voyager 2 showed " +
                    "Uranus as an almost featureless planet in visible light, without the cloud bands or storms associated " +
                    "with the other giant planets.[17] Observations from Earth have shown seasonal change and increased" +
                    " weather activity as Uranus approached its equinox in 2007. Wind speeds can reach 250 metres per" +
                    " second (900 km/h; 560 mph).";
            ttxt.setText(temp);
            img.setImageResource(R.drawable.uranus);

        }
        else if(value.equals("Pluto"))
        {
            temp="Pluto (minor planet designation: 134340 Pluto) is a dwarf planet in the Kuiper belt, a ring of bodies beyond " +
                    "Neptune. It was the first Kuiper belt object to be discovered.\n" +
                    "\n" +
                    "Pluto was discovered by Clyde Tombaugh in 1930 and was originally considered to be the ninth planet " +
                    "from the Sun. After 1992, its status as a planet was questioned following the discovery of several " +
                    "objects of similar size in the Kuiper belt. In 2005, Eris, a dwarf planet in the scattered disc which is " +
                    "27% more massive than Pluto, was discovered. This led the International Astronomical Union (IAU) to define " +
                    "the term \"planet\" formally in 2006, during their 26th General Assembly. That definition excluded Pluto" +
                    " and reclassified it as a dwarf planet.\n" +
                    "\n" +
                    "Pluto is the largest and second-most-massive known dwarf planet in the Solar System, and the ninth-largest" +
                    " and tenth-most-massive known object directly orbiting the Sun. It is the largest known trans-Neptunian" +
                    " object by volume but is less massive than Eris. Like other Kuiper belt objects, Pluto is primarily made " +
                    "of ice and rock and is relatively small—about one-sixth the mass of the Moon and one-third its volume." +
                    " It has a moderately eccentric and inclined orbit during which it ranges from 30 to 49 astronomical " +
                    "units or AU (4.4–7.4 billion km) from the Sun. This means that Pluto periodically comes closer to " +
                    "the Sun than Neptune, but a stable orbital resonance with Neptune prevents them from colliding. " +
                    "Light from the Sun takes about 5.5 hours to reach Pluto at its average distance (39.5 AU).";
            ttxt.setText(temp);
            img.setImageResource(R.drawable.pluto);

        }
        else if(value.equals("Comet"))
        {
            temp="A comet is an icy small Solar System body that, when passing close to the Sun, warms and begins to release " +
                    "gases, a process called outgassing. This produces a visible atmosphere or coma, and sometimes also a " +
                    "tail. These phenomena are due to the effects of solar radiation and the solar wind acting upon the " +
                    "nucleus of the comet. Comet nuclei range from a few hundred metres to tens of kilometres across " +
                    "and are composed of loose collections of ice, dust, and small rocky particles. The coma may be up " +
                    "to 15 times the Earth's diameter, while the tail may stretch one astronomical unit. " +
                    "If sufficiently bright, a comet may be seen from the Earth without the aid of a telescope and may " +
                    "subtend an arc of 30° (60 Moons) across the sky. Comets have been observed and recorded since ancient" +
                    " times by many cultures.\n" +
                    "\n" +
                    "Comets usually have highly eccentric elliptical orbits, and they have a wide range of orbital periods, " +
                    "ranging from several years to potentially several millions of years. Short-period comets originate" +
                    " in the Kuiper belt or its associated scattered disc, which lie beyond the orbit of Neptune. " +
                    "Long-period comets are thought to originate in the Oort cloud, a spherical cloud of icy bodies " +
                    "extending from outside the Kuiper belt to halfway to the nearest star. Long-period comets are set" +
                    " in motion towards the Sun from the Oort cloud by gravitational perturbations caused by passing stars " +
                    "and the galactic tide. Hyperbolic comets may pass once through the inner Solar System before being flung " +
                    "to interstellar space. The appearance of a comet is called an apparition";
            ttxt.setText(temp);
            img.setImageResource(R.drawable.comet);

        }
        else if(value.equals("BlackHoles"))
        {
            temp="A black hole is a region of spacetime exhibiting such strong gravitational effects that nothing—not even" +
                    " particles and electromagnetic radiation such as light—can escape from inside it.The theory of " +
                    "general relativity predicts that a sufficiently compact mass can deform spacetime to form a black hole." +
                    " The boundary of the region from which no escape is possible is called the event horizon. " +
                    "Although the event horizon has an enormous effect on the fate and circumstances of an object" +
                    " crossing it, no locally detectable features appear to be observed. In many ways a black hole acts " +
                    "like an ideal black body, as it reflects no light. Moreover, quantum field theory in curved" +
                    " spacetime predicts that event horizons emit Hawking radiation, with the same spectrum as" +
                    " a black body of a temperature inversely proportional to its mass. This temperature is on the order" +
                    " of billionths of a kelvin for black holes of stellar mass, making it essentially impossible to" +
                    " observe.\n" +
                    "\n" +
                    "Objects whose gravitational fields are too strong for light to escape were first considered in the 18th " +
                    "century by John Michell and Pierre-Simon Laplace. The first modern solution of general relativity " +
                    "that would characterize a black hole was found by Karl Schwarzschild in 1916, although its interpretation " +
                    "as a region of space from which nothing can escape was first published by David Finkelstein in 1958." +
                    " Black holes were long considered a mathematical curiosity; it was during the 1960s that" +
                    " theoretical work showed they were a generic prediction of general relativity. " +
                    "The discovery of neutron stars in the late 1960s sparked interest in gravitationally " +
                    "collapsed compact objects as a possible astrophysical reality.";
            ttxt.setText(temp);
            img.setImageResource(R.drawable.blackhole);

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);
        String P = getIntent().getStringExtra("name");
        showValue(P);

    }
}
