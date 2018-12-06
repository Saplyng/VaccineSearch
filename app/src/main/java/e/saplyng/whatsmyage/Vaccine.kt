package e.saplyng.whatsmyage

import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity

data class Vaccine(
    var name: String,
    var alias: List<String>,
    var description: List<String>
)

val hepatitusB = Vaccine("Hepatitus B Vaccine", listOf("Hepatitis B", "HepB",
    "Recombivax HB", "Engerix-B",
    "Elovac B", "Genevac B",
    "Shanvac B", "Heplisav-B",
    "Amvax B", "Bio-Hep-B",
    "Fendrex", "H-B-Vax II",
    "HB-Vax", "HBvaxPRO",
    "Hepavax Gene"), listOf("Hepatitis B vaccine is a vaccine that prevents hepatitis B.[1] The first dose is recommended within 24 hours of birth with either two or three more doses given after that.[1] This includes those with poor immune function such as from HIV/AIDS and those born premature.[1] It is also recommended for health-care workers to be vaccinated.[2] In healthy people routine immunization results in more than 95% of people being protected.[1]\n" +
        "\n" +
        "Blood testing to verify that the vaccine has worked is recommended in those at high risk.[1] Additional doses may be needed in people with poor immune function but are not necessary for most people.[1] In those who have been exposed to the hepatitis B virus but not immunized, hepatitis B immune globulin should be given in addition to the vaccine.[1] The vaccine is given by injection into a muscle.[1]\n" +
        "\n" +
        "Serious side effects from the hepatitis B vaccine are very uncommon.[1] Pain may occur at the site of injection.[1] It is safe for use during pregnancy or while breastfeeding.[1] It has not been linked to Guillain–Barré syndrome.[1] The current vaccines are produced with recombinant DNA techniques.[1] They are available both by themselves and in combination with other vaccines.[1]\n" +
        "\n" +
        "The first hepatitis B vaccine was approved in the United States in 1981.[3] A recombinant version came to market in 1986.[1] It is on the World Health Organization's List of Essential Medicines, the most effective and safe medicines needed in a health system.[4] As of 2014, the wholesale cost in the developing world is US\$0.58–13.20 per dose.[5] In the United States it costs US\$50–100.[6]"))

val rotavirus = Vaccine("Rotavirus Vaccine", listOf("Rotavirus", "Rotarix",
    "RotaTeq", "Rotavac",
    "Rotavin-M1", "Lanzhou lamb",
    "Rotasiil", "RoatTeq",
    "Lou Te Wei"), listOf(""))

val dtap = Vaccine("Diphteria, tetanus, and acellular pertussis Vaccine", listOf("Diphteria, tetanus, and acellular pertussis", "DTaP",
    "Daptacel", "Infanrix",
    "ACEL-IMUNE", "Certiva",
    "Tripedia", "D.T COQ",
    "Dif per tet all", "P.D.T. Vax Purified",
    "Tripacel", "Tripavac",
    "Tripvac"), listOf("") )

val hib = Vaccine("Haemophilus influenzae type B Vaccine", listOf("Haemophilus influenzae type B", "Hib",
    "ActHIB", "Hiberix",
    "PedvaxHIB",
    "HibTITER", "HIBest"), listOf(""))

val pneumococcal = Vaccine("Pneumococcal Vaccine", listOf("Pneumococcal", "PCV 7",
    "Prevar", "Prevenar",
    "PCV 13", "Prevnar 13",
    "Pneumovax", "Pneumovax 23",
    "Synflorix", "PPV"), listOf(""))

val polio = Vaccine("Inactivated Poliovirus Vaccine", listOf("inactivated poliovirus vaccine","IPV",
    "Ipol", "Imovax Polio",
    "Opvero", "Polio Salk (Sero)",
    "Polio Sabin One and Three"), listOf(""))

val influenza = Vaccine("Influenza Vaccine", listOf("influenza", "flu",
    "Afluria", "fluad",
    "Fluarix", "Flublok",
    "Flucelvax", "FluLaval",
    "FluMist", "Fluvirin",
    "Fluzone", "Fluzone-High-Dose",
    "Fluzone Intradermal", "Agriflu",
    "IIV3", "IIV4","RIV3","ccIIV4"), listOf(""))

val mmr = Vaccine("Measles, Mumps, and Rubella Vaccine", listOf("measles, mumps, and rubella", "MMR",
    "M-M-R II", "ProQuad",
    "M-M-R Vax", "M-M-R Vaxpro",
    "Morupar", "Mumeru Vax",
    "Pluserix", "Priorix",
    "Prioryks", "ROR Vax",
    "Trimovax", "Triviraten Berna"), listOf(""))

val varicella = Vaccine("Varicella Vaccine", listOf("varicella", "VAR",
    "Varivax", "Okavax",
    "Vaccin Varilrix",
    "Varicela Biken",
    "Varcelvax", "varipox",
    "Varivax III", "V-Z Vax"), listOf(""))

val hepA = Vaccine("Hepatitus A Vaccine", listOf("hepatitis A", "HepA",
    "Havrix", "Vaqta",
    "Avaxim", "Epaxal",
    "HAVpur", "Havrix 1440",
    "Havrix Junior", "Havrix Monodose",
    "Havryks", "Mevac-A"), listOf(""))

val serogroup = Vaccine("Serogroup A, C, W, Y Vaccine", listOf("serogroup A, C, W, Y", "Menveo",
    "Menactra", "Menacttra"), listOf(""))

val menB = Vaccine("Serogroup B miningococcal Vaccine", listOf("Serogroup B meningococcal", "Bexsero",
    "Trumenba", "MenB"),listOf(""))

val tdap = Vaccine("Tetanus, Diphtheria, and acellular Pertussis Vaccine", listOf("tetanus, diphteria, and acellular pertussis", "Tdap",
    "Adacel", "Boostrix"), listOf(""))

val hpv = Vaccine("Human Papillomavirus Vaccine", listOf("human papillomavirus", "HPV",
    "Gardasil", "Cervarix",
    "Gardasil 9"), listOf(""))


val vaccines = arrayOf(
    "Hepatitis B", "HepB",
    "Recombivax HB", "Engerix-B",
    "Elovac B", "Genevac B",
    "Shanvac B", "Heplisav-B",
    "Amvax B", "Bio-Hep-B",
    "Fendrex", "H-B-Vax II",
    "HB-Vax", "HBvaxPRO",
    "Hepavax Gene",
    "Rotavirus", "Rotarix",
    "RotaTeq", "Rotavac",
    "Rotavin-M1", "Lanzhou lamb",
    "Rotasiil", "RoatTeq",
    "Lou Te Wei",
    "Diphteria, tetanus, and acellular pertussis", "DTaP",
    "Daptacel", "Infanrix",
    "ACEL-IMUNE", "Certiva",
    "Tripedia", "D.T COQ",
    "Dif per tet all", "P.D.T. Vax Purified",
    "Tripacel", "Tripavac",
    "Tripvac",
    "Haemophilus influenzae type B", "Hib",
    "ActHIB", "Hiberix",
    "PedvaxHIB",
    "HibTITER", "HIBest",
    "Pneumococcal", "PCV 7",
    "Prevar", "Prevenar",
    "PCV 13", "Prevnar 13",
    "Pneumovax", "Pneumovax 23",
    "Synflorix", "PPV",
    "inactivated poliovirus vaccine","IPV",
    "Ipol", "Imovax Polio",
    "Opvero", "Polio Salk (Sero)",
    "Polio Sabin One and Three",
    "influenza", "flu",
    "Afluria", "fluad",
    "Fluarix", "Flublok",
    "Flucelvax", "FluLaval",
    "FluMist", "Fluvirin",
    "Fluzone", "Fluzone-High-Dose",
    "Fluzone Intradermal", "Agriflu",
    "IIV3", "IIV4","RIV3","ccIIV4",
    "measles, mumps, and rubella", "MMR",
    "M-M-R II", "ProQuad",
    "M-M-R Vax", "M-M-R Vaxpro",
    "Morupar", "Mumeru Vax",
    "Pluserix", "Priorix",
    "Prioryks", "ROR Vax",
    "Trimovax", "Triviraten Berna",
    "varicella", "VAR",
    "Varivax", "Okavax",
    "Vaccin Varilrix",
    "Varicela Biken",
    "Varcelvax", "varipox",
    "Varivax III", "V-Z Vax",
    "hepatitis A", "HepA",
    "Havrix", "Vaqta",
    "Avaxim", "Epaxal",
    "HAVpur", "Havrix 1440",
    "Havrix Junior", "Havrix Monodose",
    "Havryks", "Mevac-A",
    "serogroup A, C, W, Y", "Menveo",
    "Menactra", "Menacttra",
    "Serogroup B meningococcal", "Bexsero",
    "Trumenba", "MenB",
    "tetanus, diphteria, and acellular pertussis", "Tdap",
    "Adacel", "Boostrix",
    "human papillomavirus", "HPV",
    "Gardasil", "Cervarix",
    "Gardasil 9"
)

