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
    "Lou Te Wei"), listOf("Rotavirus vaccine is a vaccine used to protect against rotavirus infections, which are the leading cause of severe diarrhea among young children.[2] The vaccines prevent 15–34% of severe diarrhea in the developing world and 37–96% of severe diarrhea in the developed world.[3] The vaccines decrease the risk of death among young children due to diarrhea.[2] Immunizing babies decreases rates of disease among older people and those who have not been immunized.[4]\n" +
        "\n" +
        "The World Health Organization (WHO) recommends that rotavirus vaccine be included in national routine vaccinations programs, especially in areas where the disease is common.[2] This should be done along with promoting breastfeeding, handwashing, clean water and good sanitation.[2] It is given by mouth and requires two or three doses.[2] It should be given starting around six weeks of age.[2]\n" +
        "\n" +
        "The vaccines are safe.[2] This includes their use in people with HIV/AIDS.[2] An earlier vaccine that is no longer used was linked to intussusception, but the current versions are not clearly linked.[2] Due to a potential risk they are not recommended in babies who have had intussusception.[2] The vaccines are made from weakened rotavirus.[2]\n" +
        "\n" +
        "The vaccine first became available in the United States in 2006.[1] It is on the World Health Organization's List of Essential Medicines, the most effective and safe medicines needed in a health system.[5] The wholesale cost in the developing world is between US\$6.96 and \$20.66 per dose as of 2014.[6] In the United States it is more than US\$200.[7] As of 2013 there are two types of vaccine available globally, Rotarix and RotaTeq. Others are used in some countries.[2]"))

val dtap = Vaccine("Diphteria, tetanus, and acellular pertussis Vaccine", listOf("Diphteria, tetanus, and acellular pertussis", "DTaP",
    "Daptacel", "Infanrix",
    "ACEL-IMUNE", "Certiva",
    "Tripedia", "D.T COQ",
    "Dif per tet all", "P.D.T. Vax Purified",
    "Tripacel", "Tripavac",
    "Tripvac"), listOf("DPT (also DTP and DTwP) is a class of combination vaccines against three infectious diseases in humans: diphtheria, pertussis (whooping cough), and tetanus. The vaccine components include diphtheria and tetanus toxoids and killed whole cells of the bacterium that causes pertussis (wP).\n" +
        "\n" +
        "DTaP and Tdap refer to similar combination vaccines in which the component \"P\" or \"p\" with lower case \"a\" is acellular.\n" +
        "\n" +
        "Also available are the DT and Td vaccines, which lack the pertussis component.\n" +
        "\n" +
        "In the United Kingdom, the Netherlands and France, the abbreviation DTP refers to a combination vaccine against diphtheria, tetanus, and poliomyelitis. In the Netherlands, pertussis is known as kinkhoest and DKTP refers to a combination vaccine against diphtheria, kinkhoest, tetanus, and polio.\n" +
        "\n" +
        "The usual course of childhood immunization in the USA is five doses between 2 months and 15 years. For adults, Td boosters are recommended every 10 years.\n" +
        "\n" +
        "In the latter 20th century, vaccinations helped to reduce the incidence of childhood pertussis in the United States. Despite this, reported instances of the disease increased twenty-fold in the early 21st century, resulting in numerous fatalities.[1] Over this time, many parents declined to vaccinate their children against pertussis for fear of side effects.[1] In 2009, the journal Pediatrics concluded the largest risk among unvaccinated children was not the contraction of side effects, but rather the disease that the vaccination aims to protect against.[1]") )

val hib = Vaccine("Haemophilus influenzae type B Vaccine", listOf("Haemophilus influenzae type B", "Hib",
    "ActHIB", "Hiberix",
    "PedvaxHIB",
    "HibTITER", "HIBest"), listOf("The Haemophilus influenzae type B vaccine, often called Hib vaccine, is a vaccine used to prevent Haemophilus influenzae type b (Hib) infection.[1] In countries that include it as a routine vaccine, rates of severe Hib infections have decreased more than 90%.[1] It has therefore resulted in a decrease in the rate of meningitis, pneumonia, and epiglottitis.[1]\n" +
        "\n" +
        "It is recommended by both the World Health Organization and Centers for Disease Control and Prevention.[1][2] Two or three doses should be given before six months of age.[1] In the United States a fourth dose is recommended between 12 and 15 months of age.[3] The first dose is recommended around six weeks of age with at least four weeks between doses.[1] If only two doses are used, another dose later in life is recommended.[1] It is given by injection into a muscle.[1]\n" +
        "\n" +
        "Severe side effects are uncommon.[1] About 20 to 25% of people develop pain at the site of injection while about 2% develop a fever.[1] There is no clear association with severe allergic reactions.[1] The Hib vaccine is available by itself, in combination with the diphtheria/tetanus/pertussis vaccine, and in combination with the hepatitis B vaccine, among others.[1] All Hib vaccines that are currently used are conjugate vaccine.[1]\n" +
        "\n" +
        "An initial Hib vaccine was developed in 1977 which was replaced by a more effective formulation in the 1990s.[1] As of 2013, 184 countries include it in their routine vaccinations.[1] It is on the World Health Organization's List of Essential Medicines, the most effective and safe medicines needed in a health system.[4] The wholesale cost of a pentavalent vaccine which includes Hib in the developing world was US\$15.40 per dose as of 2014.[5] In the United States it costs about \$25–50 per dose.[6]"))

val pneumococcal = Vaccine("Pneumococcal Vaccine", listOf("Pneumococcal", "PCV 7",
    "Prevar", "Prevenar",
    "PCV 13", "Prevnar 13",
    "Pneumovax", "Pneumovax 23",
    "Synflorix", "PPV"), listOf("Pneumococcal vaccines are vaccines against the bacteria Streptococcus pneumoniae.[1] Their use can prevent some cases of pneumonia, meningitis, and sepsis.[1] There are two types of pneumococcal vaccines: conjugate vaccines and polysaccharide vaccines.[1] They are given by injection either into a muscle or just under the skin.[1]\n" +
        "\n" +
        "The World Health Organization recommends the use of the conjugate vaccine in the routine immunizations given to children.[1] This includes those with HIV/AIDS.[1] The recommended three or four doses are between 71 and 93% effective at preventing severe pneumococcal disease.[1] The polysaccharide vaccines, while effective in healthy adults, are not effective in children less than two years old or those with poor immune function.[1]\n" +
        "\n" +
        "These vaccines are generally safe.[1] With the conjugate vaccine about 10% of babies develop redness at the site of injection, fever, or change in sleep.[1] Severe allergies are very rare.[1]\n" +
        "\n" +
        "The first pneumococcal vaccine was developed in the 1980s.[1] They are on the World Health Organization's List of Essential Medicines, the most effective and safe medicines needed in a health system.[2] The wholesale cost in the developing world is about US\$17 per dose as of 2014.[3] In the United States it is between US\$25 and US\$100.[4]"))

val polio = Vaccine("Inactivated Poliovirus Vaccine", listOf("inactivated poliovirus vaccine","IPV",
    "Ipol", "Imovax Polio",
    "Opvero", "Polio Salk (Sero)",
    "Polio Sabin One and Three"), listOf("Polio vaccines are vaccines used to prevent poliomyelitis (polio).[1] Two types are used: an inactivated poliovirus given by injection (IPV) and a weakened poliovirus given by mouth (OPV).[1] The World Health Organization recommends all children be fully vaccinated against polio.[1] The two vaccines have eliminated polio from most of the world,[2][3] and reduced the number of cases reported each year from an estimated 350,000 in 1988 to 22 in 2017.[4]\n" +
        "\n" +
        "The inactivated polio vaccines are very safe.[1] Mild redness or pain may occur at the site of injection.[1] Oral polio vaccines cause about three cases of vaccine-associated paralytic poliomyelitis per million doses given.[1] This compares with 5,000 cases per million who are paralysed following a polio infection.[5] Both are generally safe to give during pregnancy and in those who have HIV/AIDS but are otherwise well.[1]\n" +
        "\n" +
        "The first polio vaccine was the inactivated polio vaccine.[1] It was developed by Jonas Salk and came into use in 1955.[1][6] The oral polio vaccine was developed by Albert Sabin and came into commercial use in 1961.[1][7] They are on the World Health Organization's List of Essential Medicines, the most effective and safe medicines needed in a health system.[8] The wholesale cost in the developing world is about US\$0.25 per dose for the oral form as of 2014.[9] In the United States, it costs between \$25 and \$50 for the inactivated form.[10]"))

val influenza = Vaccine("Influenza Vaccine", listOf("influenza", "flu",
    "Afluria", "fluad",
    "Fluarix", "Flublok",
    "Flucelvax", "FluLaval",
    "FluMist", "Fluvirin",
    "Fluzone", "Fluzone-High-Dose",
    "Fluzone Intradermal", "Agriflu",
    "IIV3", "IIV4","RIV3","ccIIV4"), listOf("Influenza vaccines, also known as flu shots or flu jabs, are vaccines that protect against infection by influenza viruses.[2] A new version of the vaccine is developed twice a year, as the influenza virus rapidly changes.[2] While their effectiveness varies from year to year, most provide modest to high protection against influenza.[2][3] The United States Centers for Disease Control and Prevention (CDC) estimates that vaccination against influenza reduces sickness, medical visits, hospitalizations, and deaths.[4] When an immunized worker does catch the flu, they are on average back at work a half day sooner.[5] Vaccine effectiveness in those under two years old and over 65 years old remains unknown due to the low quality of the research.[6][7] Vaccinating children may protect those around them.[2]\n" +
        "\n" +
        "The World Health Organization (WHO) and the CDC recommend yearly vaccination for nearly all people over the age of six months, especially those at high risk.[2][8][9] The European Centre for Disease Prevention and Control also recommends yearly vaccination of high risk groups.[10] These groups include pregnant women, the elderly, children between six months and five years of age, those with other health problems, and those who work in healthcare.[2]\n" +
        "\n" +
        "The vaccines are generally safe.[2] Fever occurs in five to ten percent of children vaccinated.[2] Temporary muscle pains or feelings of tiredness may occur as well.[2] In certain years, the vaccine has been linked to an increase in Guillain–Barré syndrome among older people at a rate of about one case per million doses.[2] It should not be given to those with severe allergies to previous versions of the vaccine.[2] Although most influenza vaccines are produced using egg-based techniques, influenza vaccines are nonetheless recommended for people with egg allergies, even if severe.[11] The vaccines come in both inactive and weakened viral forms.[2] The inactive version should be used for those who are pregnant.[2] They come in forms that are injected into a muscle, sprayed into the nose, or injected into the middle layer of the skin.[2]\n" +
        "\n" +
        "Vaccination against influenza began in the 1930s with large scale availability in the United States beginning in 1945.[12][13] It is on the World Health Organization's List of Essential Medicines, the most effective and safe medicines needed in a health system.[14] The wholesale price in the developing world is about \$5.25 USD per dose as of 2014.[15] In the United States, it costs less than \$25 USD as of 2015.[16]"))

val mmr = Vaccine("Measles, Mumps, and Rubella Vaccine", listOf("measles, mumps, and rubella", "MMR",
    "M-M-R II", "ProQuad",
    "M-M-R Vax", "M-M-R Vaxpro",
    "Morupar", "Mumeru Vax",
    "Pluserix", "Priorix",
    "Prioryks", "ROR Vax",
    "Trimovax", "Triviraten Berna"), listOf("The MMR vaccine is a vaccine against measles, mumps, and rubella (German measles).[2] The first dose is generally given to children around 9 to 15 months of age, with a second dose at 15 months to 6 years of age, with at least 4 weeks between the doses.[3][4] After two doses 97% of people are protected against measles, 88% against mumps, and at least 97% against rubella.[3] The vaccine is also recommended in those who do not have evidence of immunity,[3] those with well controlled HIV/AIDS,[5][6] and within 72 hours of exposure to measles among those who are incompletely immunized.[4] It is given by injection.[3]\n" +
        "\n" +
        "The MMR vaccine is widely used around the world; with over 500 million doses having been given in over 100 countries as of 2001.[7][8] Measles resulted in 2.6 million deaths per year before immunization became common.[8] This has decreased to 122,000 deaths per year as of 2012, mostly in low income countries.[8] Through vaccination, as of 2018, rates of measles in North and South America are very low.[8] Rates of disease have been seen to increase in populations who go unvaccinated.[8] Between 2000 and 2016, vaccination decreased measles deaths by a further 84%.[9]\n" +
        "\n" +
        "Side effects of immunization are generally mild and go away without any specific treatment.[10] These may include fever, and pain or redness at the injection site.[10] Severe allergic reactions occur in about one in a million people.[10] The MMR vaccine is not recommended during pregnancy, however, may be given while breastfeeding.[3] The vaccine is safe to give at the same time as other vaccines.[10] Being recently immunized does not increase the risk of passing measles, mumps, or rubella on to others.[3] Vaccination does not increase the risk of autism.[11][12] The MMR vaccine is a mixture of live weakened viruses of the three diseases.[3]\n" +
        "\n" +
        "The MMR vaccine was developed by Maurice Hilleman.[2] It was licensed for use by Merck in 1971.[13] Stand alone measles, mumps, and rubella vaccines had been previously licensed in 1963, 1967, and 1969 respectively.[13][14] Recommendations for a second dose were introduced in 1989.[13] The MMRV vaccine which also covers chickenpox may be used instead.[3] An MR vaccine, without coverage for mumps, is also occasionally used.[15]\n" +
        "\n"))

val varicella = Vaccine("Varicella Vaccine", listOf("varicella", "VAR",
    "Varivax", "Okavax",
    "Vaccin Varilrix",
    "Varicela Biken",
    "Varcelvax", "varipox",
    "Varivax III", "V-Z Vax"), listOf("Varicella vaccine, also known as chickenpox vaccine, is a vaccine that protects against chickenpox.[1] One dose of vaccine prevents 95% of moderate disease and 100% of severe disease.[2] Two doses of vaccine are more effective than one.[2] If given to those who are not immune within five days of exposure to chickenpox it prevents most cases of disease.[2] Vaccinating a large portion of the population also protects those who are not vaccinated.[2] It is given by injection just under the skin.[2]\n" +
        "\n" +
        "The World Health Organization (WHO) recommends routine vaccination only if a country can keep more than 80% of people vaccinated.[2] If only 20% to 80% of people are vaccinated it is possible that more people will get the disease at an older age and outcomes overall may worsen.[2] Either one or two doses of the vaccine is recommended.[2] In the United States two doses are recommended starting at twelve to fifteen months of age.[1] As of 2012 most European countries either recommend it for all children or just those at high risk,[3] but not all countries provide the vaccine due to its cost.[4]\n" +
        "\n" +
        "Minor side effects may include pain at the site of injection, fever, and rash.[1] Severe side effects are rare and occur mostly in those with poor immune function.[2] Its use in people with HIV/AIDS should be done with care.[2] It is not recommended during pregnancy; however, the few times it has been given during pregnancy no problems resulted.[1][2] The vaccine is available either by itself or along with the MMR vaccine, in a version known as the MMRV vaccine.[2] It is made from weakened virus.[1]\n" +
        "\n" +
        "The chickenpox vaccine first became commercially available in 1984.[2] It is on the World Health Organization's List of Essential Medicines, the most effective and safe medicines needed in a health system.[5] In the United States it costs between 100 and 200 USD.[6]"))

val hepA = Vaccine("Hepatitus A Vaccine", listOf("hepatitis A", "HepA",
    "Havrix", "Vaqta",
    "Avaxim", "Epaxal",
    "HAVpur", "Havrix 1440",
    "Havrix Junior", "Havrix Monodose",
    "Havryks", "Mevac-A"), listOf("Hepatitis A vaccine is a vaccine that prevents hepatitis A.[1] It is effective in around 95% of cases and lasts for at least fifteen years and possibly a person's entire life.[1][2] If given, two doses are recommended beginning after the age of one.[1] It is given by injection into a muscle.[1]\n" +
        "\n" +
        "The World Health Organization (WHO) recommends universal vaccination in areas where the diseases is moderately common.[1] Where the disease is very common, widespread vaccination is not recommended as all people typically develop immunity through infection when a child.[1] The Center for Disease Control and Prevention (CDC) recommends vaccinating adults who are at high risk and all children.[3]\n" +
        "\n" +
        "Severe side effects are very rare.[1] Pain at the site of injection occurs in about 15% of children and half of adults.[1] Most hepatitis A vaccines contain inactivated virus while a few contain weakened virus.[1] The ones with weakened virus are not recommended during pregnancy or in those with poor immune function.[1] A few formulations combine hepatitis A with either hepatitis B or typhoid vaccine.[1]\n" +
        "\n" +
        "The first hepatitis A vaccine was approved in Europe in 1991 and the United States in 1995.[4] It is on the World Health Organization's List of Essential Medicines, the most effective and safe medicines needed in a health system.[5] In the United States it costs US\$50–100.[6]"))

val serogroup = Vaccine("Serogroup A, C, W, Y Vaccine", listOf("serogroup A, C, W, Y", "Menveo",
    "Menactra", "Menacttra"), listOf("Meningococcal vaccine refers to any of the vaccines used to prevent infection by Neisseria meningitidis.[1] Different versions are effective against some or all of the following types of meningococcus: A, C, W-135, and Y.[1] The vaccines are between 85 and 100% effective for at least two years.[1] They result in a decrease in meningitis and sepsis among populations where they are widely used.[2][3] They are given either by injection into a muscle or just under the skin.[1]\n" +
        "\n" +
        "The World Health Organization recommends that countries with a moderate or high rate of disease or with frequent outbreaks should routinely vaccinate.[1][4] In countries with a low risk of disease, they recommend that high risk groups should be immunized.[1] In the African meningitis belt efforts to immunize all people between the ages of one and thirty with the meningococcal A conjugate vaccine are ongoing.[4] In Canada and the United States the vaccines effective against all four types of meningococcus are recommended routinely for teenagers and others who are at high risk.[1] Saudi Arabia requires vaccination with the quadrivalent vaccine for international travelers to Mecca for Hajj.[1][5]\n" +
        "\n" +
        "Safety is generally good.[1] Some people develop pain and redness at the injection site.[1] Use in pregnancy appears to be safe.[4] Severe allergic reactions occur in less than one in a million doses.[1]\n" +
        "\n" +
        "The first meningococcal vaccine became available in the 1970s.[6] It is on the World Health Organization's List of Essential Medicines, the most effective and safe medicines needed in a health system.[7] The wholesale cost in the developing world is between US \$3.23 and \$10.77 per dose as of 2014.[8] In the United States it costs \$100–200 for a course.[9]"))

val menB = Vaccine("Serogroup B miningococcal Vaccine", listOf("Serogroup B meningococcal", "Bexsero",
    "Trumenba", "MenB"),listOf("Vaccines against serotype B meningococcal disease have proved difficult to produce, and require a different approach from vaccines against other serotypes. Whereas effective polysaccharide vaccines have been produced against types A, C, W-135, and Y, the capsular polysaccharide on the type B bacterium is too similar to human neural adhesion molecules to be a useful target.[25]\n" +
        "\n" +
        "A number of \"serogroup B\" vaccines have been produced. Strictly speaking, these are not \"serogroup B\" vaccines, as they do not aim to produce antibodies to the group B antigen: it would be more accurate to describe them as serogroup independent vaccines, as they employ different antigenic components of the organism; indeed, some of the antigens are common to different Neisseria species.\n" +
        "\n" +
        "A vaccine for serogroup B was developed in Cuba in response to a large outbreak of meningitis B during the 1980s. The VA-MENGOC-BC vaccine proved safe and effective in randomized double-blind studies,[26][27][28] but it was granted a licence only for research purposes in the United States[29] as political differences limited cooperation between the two countries.[30]\n" +
        "\n" +
        "Due to a similarly high prevalence of B-serotype meningitis in Norway between 1975 and 1985, Norwegian health authorities developed a vaccine specifically designed for Norwegian children and young adolescents. Clinical trials were discontinued after the vaccine was shown to cover only slightly more than 50% of all cases. Furthermore, lawsuits for damages were filed against the State of Norway by persons affected by serious adverse reactions. Information that the health authorities obtained during the vaccine development were subsequently passed on to Chiron (now GlaxoSmithKline), who developed a similar vaccine, MeNZB, for New Zealand.\n" +
        "\n" +
        "A MenB vaccine was approved for use in Europe in January 2013. Following a positive recommendation from the European Union's Committee for Medicinal Products for Human Use, Bexsero, produced by Novartis, received a licence from the European Commission.[31] However, deployment in individual EU member countries still depends on decisions by national governments. In July 2013, the United Kingdom's Joint Committee on Vaccination and Immunisation (JCVI) issued an interim position statement recommending against adoption of Bexsero as part of a routine meningococcal B immunisation program, on the grounds of cost-effectiveness.[32] This decision was reverted in favor of Bexsero vaccination in March 2014.[33] In March 2015 the UK government announced that they had reached agreement with GlaxoSmithKline who had taken over Novartis' vaccines business, and that Bexsero would be introduced into the UK routine immunization schedule later in 2015.[34]\n" +
        "\n" +
        "In November 2013, in response to an outbreak of B-serotype meningitis on the campus of Princeton University, the acting head of the Centers for Disease Control meningitis and vaccine preventable diseases branch told NBC News that they had authorized emergency importation of Bexsero to stop the outbreak.[35] Bexsero was subsequently approved by the FDA in February 2015.[36]\n" +
        "\n" +
        "In October 2014, Trumenba, a serogroup B vaccine produced by Pfizer, was approved by the FDA.[37]"))

val tdap = Vaccine("Tetanus, Diphtheria, and acellular Pertussis Vaccine", listOf("tetanus, diphteria, and acellular pertussis", "Tdap",
    "Adacel", "Boostrix"), listOf("Also dTpa, is a tetanus toxoid, reduced diphtheria toxoid and acellular pertussis vaccine (Tdap) was licensed in the United States for use in adults and adolescents on June 10, 2005.[5] The lower case \"d\" and \"p\" indicated smaller concentrations of diphtheria toxoids and pertussis antigens, and \"a\" in \"ap\" indicates that the pertussis toxoids are acellular. Two Tdap vaccines are available in the U.S. Adacel, manufactured by Sanofi Pasteur, is licensed for use in adults ages 11 to 64. Boostrix, manufactured by GlaxoSmithKline, is licensed for use in adolescents and adults ages 10 to 64. In January 2011, the U.S.'s Advisory Committee on Immunization Practices (ACIP) recommended Tdap's use in adults of all ages, including those age 65 and above. [6] In October 2011, in an effort to reduce the burden of pertussis in infants, the ACIP recommended that unvaccinated pregnant women receive a dose of Tdap. On October 24, 2012, the ACIP voted to recommend use of Tdap during every pregnancy.[7]\n" +
        "\n" +
        "The U.S.'s Advisory Committee on Immunization Practices (ACIP) and Canada's National Advisory Committee on Immunization (NACI) recommended that both adolescents and adults receive Tdap in place of their next Td booster (recommended to be given every 10 years).[8][9][10][11] Tdap and Td can be used as prophylaxis for tetanus in wound management. People who will be in contact with young infants are encouraged to get Tdap even if it has been less than 5 years since Td or TT to reduce the risk of infants being exposed to pertussis. The ACIP statement on Tdap use in adolescents encourages 5 years between Td and Tdap to reduce the risk of side effects;[citation needed] however, both suggest that shorter intervals may be appropriate in some circumstances, such as for protection in pertussis outbreaks. NACI suggests intervals shorter than 5 years can be used for catch-up programs and other instances where programmatic concerns make 5-year intervals difficult.[citation needed]\n" +
        "\n" +
        "The World Health Organization recommends a pentavalent vaccine, combining the DTP vaccine with vaccines against Haemophilus influenzae type B and hepatitis B. There is not yet sufficient evidence on how effective this pentavalent vaccine is compared to the individual vaccines.[12]"))

val hpv = Vaccine("Human Papillomavirus Vaccine", listOf("human papillomavirus", "HPV",
    "Gardasil", "Cervarix",
    "Gardasil 9"), listOf("Human papilloma virus (HPV) vaccines are vaccines that prevent infection by certain types of human papillomavirus.[1] Available vaccines protect against either two, four, or nine types of HPV.[1][2] All vaccines protect against at least HPV type 16 and 18 that cause the greatest risk of cervical cancer.[1] It is estimated that they may prevent 70% of cervical cancer, 80% of anal cancer, 60% of vaginal cancer, 40% of vulvar cancer, and possibly some mouth cancer.[3][4][5] They additionally prevent some genital warts with the vaccines against 4 and 9 HPV types providing greater protection.[1]\n" +
        "\n" +
        "The World Health Organization (WHO) recommends HPV vaccines as part of routine vaccinations in all countries, along with other prevention measures.[1] The vaccines require two or three doses depending on a person's age and immune status.[1] Vaccinating girls around the ages of nine to thirteen is typically recommended.[1] The vaccines provide protection for at least 5 to 10 years.[1] Cervical cancer screening is still required following vaccination.[1] Vaccinating a large portion of the population may also benefit the unvaccinated.[6] In those already infected the vaccines are not effective.[1]\n" +
        "\n" +
        "HPV vaccines are very safe.[1] Pain at the site of injection occurs in about 80% of people.[1] Redness and swelling at the site and fever may also occur.[1] No link to Guillain–Barré syndrome has been found.[1]\n" +
        "\n" +
        "The first HPV vaccine became available in 2006.[1][7] As of 2017, 71 countries include it in their routine vaccinations, at least for girls.[1] They are on the World Health Organization's List of Essential Medicines, the most effective and safe medicines needed in a health system.[8] The wholesale cost in the developing world is about US\$47 a dose as of 2014.[9] In the United States it costs more than US\$200.[10] Vaccination may be cost effective in the developing world.[11]"))


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

