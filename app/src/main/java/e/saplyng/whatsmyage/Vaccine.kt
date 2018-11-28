package e.saplyng.whatsmyage

data class Vaccine(
    var name: String,
    var alias: List<String>,
    var description: String
)

val hepatitusB = Vaccine("Hepatitus B", listOf("Hepatitis B", "HepB",
    "Recombivax HB", "Engerix-B",
    "Elovac B", "Genevac B",
    "Shanvac B", "Heplisav-B",
    "Amvax B", "Bio-Hep-B",
    "Fendrex", "H-B-Vax II",
    "HB-Vax", "HBvaxPRO",
    "Hepavax Gene"), "")

val rotavirus = Vaccine("Rotavirus", listOf("Rotavirus", "Rotarix",
    "RotaTeq", "Rotavac",
    "Rotavin-M1", "Lanzhou lamb",
    "Rotasiil", "RoatTeq",
    "Lou Te Wei"), "")

val dtap = Vaccine("Diphteria, tetanus, and acellular pertussis", listOf("Diphteria, tetanus, and acellular pertussis", "DTaP",
    "Daptacel", "Infanrix",
    "ACEL-IMUNE", "Certiva",
    "Tripedia", "D.T COQ",
    "Dif per tet all", "P.D.T. Vax Purified",
    "Tripacel", "Tripavac",
    "Tripvac"), "" )

val hib = Vaccine("Haemophilus influenzae type B", listOf("Haemophilus influenzae type B", "Hib",
    "ActHIB", "Hiberix",
    "PedvaxHIB",
    "HibTITER", "HIBest"), "")

val pneumococcal = Vaccine("Pneumococcal", listOf("Pneumococcal", "PCV 7",
    "Prevar", "Prevenar",
    "PCV 13", "Prevnar 13",
    "Pneumovax", "Pneumovax 23",
    "Synflorix", "PPV"), "")

val polio = Vaccine("Inactivated poliovirus vaccine", listOf("inactivated poliovirus vaccine","IPV",
    "Ipol", "Imovax Polio",
    "Opvero", "Polio Salk (Sero)",
    "Polio Sabin One and Three"), "")

val influenza = Vaccine("Influenza", listOf("influenza", "flu",
    "Afluria", "fluad",
    "Fluarix", "Flublok",
    "Flucelvax", "FluLaval",
    "FluMist", "Fluvirin",
    "Fluzone", "Fluzone-High-Dose",
    "Fluzone Intradermal", "Agriflu",
    "IIV3", "IIV4","RIV3","ccIIV4"), "")

val mmr = Vaccine("Measles, Mumps, and Rubella", listOf("measles, mumps, and rubella", "MMR",
    "M-M-R II", "ProQuad",
    "M-M-R Vax", "M-M-R Vaxpro",
    "Morupar", "Mumeru Vax",
    "Pluserix", "Priorix",
    "Prioryks", "ROR Vax",
    "Trimovax", "Triviraten Berna"), "")

val varicella = Vaccine("Varicella", listOf("varicella", "VAR",
    "Varivax", "Okavax",
    "Vaccin Varilrix",
    "Varicela Biken",
    "Varcelvax", "varipox",
    "Varivax III", "V-Z Vax"), "")

val hepA = Vaccine("Hepatitus A", listOf("hepatitis A", "HepA",
    "Havrix", "Vaqta",
    "Avaxim", "Epaxal",
    "HAVpur", "Havrix 1440",
    "Havrix Junior", "Havrix Monodose",
    "Havryks", "Mevac-A"), "")

val serogroup = Vaccine("Serogroup A, C, W, Y", listOf("serogroup A, C, W, Y", "Menveo",
    "Menactra", "Menacttra"), "")

val menB = Vaccine("Serogroup B miningococcal", listOf("Serogroup B meningococcal", "Bexsero",
    "Trumenba", "MenB"),"")

val tdap = Vaccine("Tetanus, Diphtheria, and acellular Pertussis", listOf("tetanus, diphteria, and acellular pertussis", "Tdap",
    "Adacel", "Boostrix"), "")

val hpv = Vaccine("Human Papillomavirus", listOf("human papillomavirus", "HPV",
    "Gardasil", "Cervarix",
    "Gardasil 9"), "")


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