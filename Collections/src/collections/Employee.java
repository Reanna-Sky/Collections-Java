package collections;

import java.util.*;

/*
 * This is a regular collections.Employee class, but contains data for
 * 650 random Employees, with realistic names, etc.
 * This can be used for some exercises, e.g. Collections of Lambdas
 */
public class Employee {

    private int id;
    private int age;
    private String firstname;
    private String lastname;
    private double salary;
    private String department;

    public Employee(int id, String firstname, String lastname) {
        this(id, firstname, lastname, randomAge(), randomSalary(), randomDepartment());
    }

    public Employee(int id, String firstname, String lastname, int age, double salary, String department) {
        this.id = id;
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.department = department;
    }
//formats the list
    public String getDetails() {
        String myStr = "%-25s%-5d%-15s%-5.0f\n";
        return String.format(myStr, getFullname(), age, department, salary);
    }

    public void increaseSalary(double percent) {
        salary += salary * (percent / 100.0);
    }

    public String getFullname() {
        return firstname + " " + lastname;
    }

    public void incAge() {
        age++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) { this.salary = salary; }

    public int getId() { return id; }

    public String getDepartment() { return department; }


    private static Random R = new Random();
    private static String randomDepartment() {
        int x = R.nextInt(5);
        switch (x) {
            case 0: return "ADMIN";
            case 1: return "SALES";
            case 2: return "ADVERTISING";
            case 3: return "SUPPORT";
            case 4: return "DEV";
            default: return "?";
        }
    }

    private static int randomAge() {
        return (int)(R.nextGaussian() * 10.0 + 40.0);
    }

    private static double randomSalary() {
        return 100 * Math.round(R.nextGaussian() * 100.0 + 400.0);
    }

    public static class EmployeeNameComparator implements Comparator<Employee> {

        public int compare(Employee e1, Employee e2) {
            return e1.getFullname().compareTo(e2.getFullname());
        }
    }

    public static class EmployeeAgeComparator implements Comparator<Employee>{

        public int compare(Employee e1, Employee e2) {
            int difference = e1.getAge() - e2.getAge();
            if(difference == 0) {
                return new EmployeeNameComparator().compare(e1, e2);
            }
            return difference;
        }
    }









    public static List<Employee> getSomeEmployees() {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10001,"Diane","Abbott"));
        employees.add(new Employee(25034,"Debbie","Abrahams"));
        employees.add(new Employee(24878,"Nigel","Adams"));
        employees.add(new Employee(25661,"Bim","Afolami"));
        employees.add(new Employee(11929,"Adam","Afriyie"));
        employees.add(new Employee(24904,"Peter","Aldous"));
        employees.add(new Employee(24953,"Heidi","Alexander"));
        employees.add(new Employee(24958,"Rushanara","Ali"));
        employees.add(new Employee(25337,"Lucy","Allan"));
        employees.add(new Employee(25348,"Heidi","Allen"));
        employees.add(new Employee(25579,"Rosena","Allin-Khan"));
        employees.add(new Employee(25702,"Mike","Amesbury"));
        employees.add(new Employee(10009,"David","Amess"));
        employees.add(new Employee(24864,"Stuart","Andrew"));
        employees.add(new Employee(25634,"Tonia","Antoniazzi"));
        employees.add(new Employee(25396,"Edward","Argar"));
        employees.add(new Employee(25120,"Jon","Ashworth"));
        employees.add(new Employee(25424,"Victoria","Atkins"));
        employees.add(new Employee(11553,"Ian","Austin"));
        employees.add(new Employee(10707,"Richard","Bacon"));
        employees.add(new Employee(25693,"Kemi","Badenoch"));
        employees.add(new Employee(10683,"Adrian","Bailey"));
        employees.add(new Employee(24786,"Steven","Baker"));
        employees.add(new Employee(24785,"Harriett","Baldwin"));
        employees.add(new Employee(24916,"Stephen","Barclay"));
        employees.add(new Employee(25409,"Hannah","Bardell"));
        employees.add(new Employee(10715,"John","Baron"));
        employees.add(new Employee(10027,"Kevin","Barron"));
        employees.add(new Employee(24736,"Guto","Bebb"));
        employees.add(new Employee(10031,"Margaret","Beckett"));
        employees.add(new Employee(10726,"Henry","Bellingham"));
        employees.add(new Employee(10669,"Hilary","Benn"));
        employees.add(new Employee(11727,"Richard","Benyon"));
        employees.add(new Employee(10040,"John","Bercow"));
        employees.add(new Employee(10041,"Paul","Beresford"));
        employees.add(new Employee(24924,"Luciana","Berger"));
        employees.add(new Employee(24860,"Jake","Berry"));
        employees.add(new Employee(10045,"Clive","Betts"));
        employees.add(new Employee(25269,"Mhairi","Black"));
        employees.add(new Employee(25361,"Ian","Blackford"));
        employees.add(new Employee(24945,"Bob","Blackman"));
        employees.add(new Employee(25314,"Kirsty","Blackman"));
        employees.add(new Employee(11558,"Roberta","Blackman-Woods"));
        employees.add(new Employee(24943,"Paul","Blomfield"));
        employees.add(new Employee(10051,"Crispin","Blunt"));
        employees.add(new Employee(24766,"Nicholas","Boles"));
        employees.add(new Employee(11915,"Peter","Bone"));
        employees.add(new Employee(10057,"Peter","Bottomley"));
        employees.add(new Employee(25703,"Andrew","Bowie"));
        employees.add(new Employee(25592,"Tracy","Brabin"));
        employees.add(new Employee(25683,"Ben","Bradley"));
        employees.add(new Employee(24725,"Karen","Bradley"));
        employees.add(new Employee(10061,"Ben","Bradshaw"));
        employees.add(new Employee(10062,"Graham","Brady"));
        employees.add(new Employee(13893,"Mickey","Brady"));
        employees.add(new Employee(10063,"Tom","Brake"));
        employees.add(new Employee(25272,"Suella","Braverman"));
        employees.add(new Employee(10753,"Kevin","Brennan"));
        employees.add(new Employee(25698,"Jack","Brereton"));
        employees.add(new Employee(24741,"Andrew","Bridgen"));
        employees.add(new Employee(24901,"Steve","Brine"));
        employees.add(new Employee(25336,"Deidre","Brock"));
        employees.add(new Employee(11640,"James","Brokenshire"));
        employees.add(new Employee(25268,"Alan","Brown"));
        employees.add(new Employee(11921,"Lyn","Brown"));
        employees.add(new Employee(10069,"Nick","Brown"));
        employees.add(new Employee(24857,"Fiona","Bruce"));
        employees.add(new Employee(10761,"Chris","Bryant"));
        employees.add(new Employee(10075,"Karen","Buck"));
        employees.add(new Employee(24843,"Robert","Buckland"));
        employees.add(new Employee(10076,"Richard","Burden"));
        employees.add(new Employee(25659,"Alex","Burghart"));
        employees.add(new Employee(25391,"Richard","Burgon"));
        employees.add(new Employee(24780,"Conor","Burns"));
        employees.add(new Employee(10770,"Alistair","Burt"));
        employees.add(new Employee(11447,"Dawn","Butler"));
        employees.add(new Employee(11360,"Liam","Byrne"));
        employees.add(new Employee(10084,"Vincent","Cable"));
        employees.add(new Employee(25343,"Ruth","Cadbury"));
        employees.add(new Employee(24740,"Alun","Cairns"));
        employees.add(new Employee(25276,"Lisa","Cameron"));
        employees.add(new Employee(10086,"Alan","Campbell"));
        employees.add(new Employee(10780,"Gregory","Campbell"));
        employees.add(new Employee(10089,"Ronnie","Campbell"));
        employees.add(new Employee(25642,"Dan","Carden"));
        employees.add(new Employee(10785,"Alistair","Carmichael"));
        employees.add(new Employee(25414,"James","Cartlidge"));
        employees.add(new Employee(10095,"Bill","Cash"));
        employees.add(new Employee(25397,"Maria","Caulfield"));
        employees.add(new Employee(25340,"Alex","Chalk"));
        employees.add(new Employee(25168,"Sarah","Champion"));
        employees.add(new Employee(25305,"Douglas","Chapman"));
        employees.add(new Employee(24711,"Jenny","Chapman"));
        employees.add(new Employee(25676,"Bambos","Charalambous"));
        employees.add(new Employee(25404,"Joanna","Cherry"));
        employees.add(new Employee(24920,"Rehman","Chishti"));
        employees.add(new Employee(10103,"Christopher","Chope"));
        employees.add(new Employee(25408,"Jo","Churchill"));
        employees.add(new Employee(25678,"Colin","Clark"));
        employees.add(new Employee(11884,"Greg","Clark"));
        employees.add(new Employee(10115,"Kenneth","Clarke"));
        employees.add(new Employee(25657,"Simon","Clarke"));
        employees.add(new Employee(25376,"James","Cleverly"));
        employees.add(new Employee(10119,"Geoffrey","Clifton-Brown"));
        employees.add(new Employee(10120,"Ann","Clwyd"));
        employees.add(new Employee(10121,"Vernon","Coaker"));
        employees.add(new Employee(10122,"Ann","Coffey"));
        employees.add(new Employee(24771,"Therese","Coffey"));
        employees.add(new Employee(24744,"Damian","Collins"));
        employees.add(new Employee(25283,"Julie","Cooper"));
        employees.add(new Employee(11667,"Rosie","Cooper"));
        employees.add(new Employee(10131,"Yvette","Cooper"));
        employees.add(new Employee(10133,"Jeremy","Corbyn"));
        employees.add(new Employee(25413,"Alberto","Costa"));
        employees.add(new Employee(25593,"Robert","Courts"));
        employees.add(new Employee(25288,"Ronnie","Cowan"));
        employees.add(new Employee(11541,"Geoffrey","Cox"));
        employees.add(new Employee(25326,"Neil","Coyle"));
        employees.add(new Employee(11768,"Stephen","Crabb"));
        employees.add(new Employee(10141,"David","Crausby"));
        employees.add(new Employee(25295,"Angela","Crawley"));
        employees.add(new Employee(11898,"Mary","Creagh"));
        employees.add(new Employee(24949,"Stella","Creasy"));
        employees.add(new Employee(24871,"Tracey","Crouch"));
        employees.add(new Employee(10828,"Jon","Cruddas"));
        employees.add(new Employee(10143,"John","Cryer"));
        employees.add(new Employee(25393,"Judith","Cummins"));
        employees.add(new Employee(24742,"Alex","Cunningham"));
        employees.add(new Employee(10147,"Jim","Cunningham"));
        employees.add(new Employee(24798,"Nicholas","Dakin"));
        employees.add(new Employee(10155,"Edward","Davey"));
        employees.add(new Employee(10842,"Wayne","David"));
        employees.add(new Employee(25282,"Chris","Davies"));
        employees.add(new Employee(11719,"David","Davies"));
        employees.add(new Employee(10159,"Geraint","Davies"));
        employees.add(new Employee(24739,"Glyn","Davies"));
        employees.add(new Employee(25330,"Mims","Davies"));
        employees.add(new Employee(11816,"Philip","Davies"));
        employees.add(new Employee(10162,"David","Davis"));
        employees.add(new Employee(25307,"Martyn","Day"));
        employees.add(new Employee(25620,"Marsha","de Cordova"));
        employees.add(new Employee(24811,"Gloria","De Piero"));
        employees.add(new Employee(25402,"Thangam","Debbonaire"));
        employees.add(new Employee(25706,"Emma","Dent Coad"));
        employees.add(new Employee(25695,"Tanmanjeet Singh","Dhesi"));
        employees.add(new Employee(24873,"Caroline","Dinenage"));
        employees.add(new Employee(10854,"Jonathan","Djanogly"));
        employees.add(new Employee(25628,"Leo","Docherty"));
        employees.add(new Employee(25275,"Martin","Docherty"));
        employees.add(new Employee(25618,"Anneliese","Dodds"));
        employees.add(new Employee(10857,"Nigel","Dodds"));
        employees.add(new Employee(10172,"Jeffrey M.","Donaldson"));
        employees.add(new Employee(25316,"Michelle","Donelan"));
        employees.add(new Employee(11397,"Nadine","Dorries"));
        employees.add(new Employee(25410,"Steve","Double"));
        employees.add(new Employee(25166,"Stephen","Doughty"));
        employees.add(new Employee(25309,"Peter","Dowd"));
        employees.add(new Employee(25323,"Oliver","Dowden"));
        employees.add(new Employee(24957,"Jackie","Doyle-Price"));
        employees.add(new Employee(24903,"Richard","Drax"));
        employees.add(new Employee(10177,"David","Drew"));
        employees.add(new Employee(24825,"Jack","Dromey"));
        employees.add(new Employee(11785,"James","Duddridge"));
        employees.add(new Employee(25656,"Rosie","Duffield"));
        employees.add(new Employee(25664,"David","Duguid"));
        employees.add(new Employee(10179,"Alan","Duncan"));
        employees.add(new Employee(10180,"Iain","Duncan Smith"));
        employees.add(new Employee(11696,"Philip","Dunne"));
        employees.add(new Employee(10182,"Angela","Eagle"));
        employees.add(new Employee(10183,"Maria","Eagle"));
        employees.add(new Employee(24743,"Jonathan","Edwards"));
        employees.add(new Employee(10185,"Clive","Efford"));
        employees.add(new Employee(24710,"Julie","Elliott"));
        employees.add(new Employee(24866,"Michael","Ellis"));
        employees.add(new Employee(10186,"Louise","Ellman"));
        employees.add(new Employee(11437,"Tobias","Ellwood"));
        employees.add(new Employee(25490,"Chris","Elmore"));
        employees.add(new Employee(24777,"Charlie","Elphicke"));
        employees.add(new Employee(24905,"Bill","Esterson"));
        employees.add(new Employee(24933,"George","Eustice"));
        employees.add(new Employee(24721,"Chris","Evans"));
        employees.add(new Employee(10190,"Nigel","Evans"));
        employees.add(new Employee(11408,"David","Evennett"));
        employees.add(new Employee(10193,"Michael","Fabricant"));
        employees.add(new Employee(10194,"Michael","Fallon"));
        employees.add(new Employee(10882,"Paul","Farrelly"));
        employees.add(new Employee(11923,"Tim","Farron"));
        employees.add(new Employee(25277,"Marion","Fellows"));
        employees.add(new Employee(10197,"Frank","Field"));
        employees.add(new Employee(10884,"Mark","Field"));
        employees.add(new Employee(10199,"Jim","Fitzpatrick"));
        employees.add(new Employee(25319,"Colleen","Fletcher"));
        employees.add(new Employee(10202,"Caroline","Flint"));
        employees.add(new Employee(10203,"Paul","Flynn"));
        employees.add(new Employee(25614,"Vicky","Ford"));
        employees.add(new Employee(25338,"Kevin","Foster"));
        employees.add(new Employee(24805,"Yvonne","Fovargue"));
        employees.add(new Employee(10213,"Liam","Fox"));
        employees.add(new Employee(25380,"Vicky","Foxcroft"));
        employees.add(new Employee(10901,"Mark","Francois"));
        employees.add(new Employee(25399,"Lucy","Frazer"));
        employees.add(new Employee(24817,"George","Freeman"));
        employees.add(new Employee(24934,"Mike","Freer"));
        employees.add(new Employee(25622,"James","Frith"));
        employees.add(new Employee(25489,"Gill","Furniss"));
        employees.add(new Employee(25384,"Marcus","Fysh"));
        employees.add(new Employee(25660,"Hugh","Gaffney"));
        employees.add(new Employee(10217,"Roger","Gale"));
        employees.add(new Employee(10219,"Mike","Gapes"));
        employees.add(new Employee(10220,"Barry","Gardiner"));
        employees.add(new Employee(24824,"Mark","Garnier"));
        employees.add(new Employee(11633,"David","Gauke"));
        employees.add(new Employee(25633,"Ruth","George"));
        employees.add(new Employee(25324,"Stephen","Gethins"));
        employees.add(new Employee(25354,"Nusrat","Ghani"));
        employees.add(new Employee(10225,"Nick","Gibb"));
        employees.add(new Employee(25300,"Patricia","Gibson"));
        employees.add(new Employee(10913,"Michelle","Gildernew"));
        employees.add(new Employee(25666,"Preet Kaur","Gill"));
        employees.add(new Employee(10228,"Cheryl","Gillan"));
        employees.add(new Employee(25629,"Paul","Girvan"));
        employees.add(new Employee(24839,"John","Glen"));
        employees.add(new Employee(24927,"Mary","Glindon"));
        employees.add(new Employee(10231,"Roger","Godsiff"));
        employees.add(new Employee(24911,"Zac","Goldsmith"));
        employees.add(new Employee(11421,"Helen","Goodman"));
        employees.add(new Employee(11804,"Robert","Goodwill"));
        employees.add(new Employee(11858,"Michael","Gove"));
        employees.add(new Employee(25299,"Patrick","Grady"));
        employees.add(new Employee(25625,"Luke","Graham"));
        employees.add(new Employee(24921,"Richard","Graham"));
        employees.add(new Employee(25643,"Bill","Grant"));
        employees.add(new Employee(24796,"Helen","Grant"));
        employees.add(new Employee(25273,"Peter","Grant"));
        employees.add(new Employee(10240,"James","Gray"));
        employees.add(new Employee(25293,"Neil","Gray"));
        employees.add(new Employee(10920,"Chris","Grayling"));
        employees.add(new Employee(25359,"Chris","Green"));
        employees.add(new Employee(10241,"Damian","Green"));
        employees.add(new Employee(24896,"Kate","Green"));
        employees.add(new Employee(11771,"Justine","Greening"));
        employees.add(new Employee(24774,"Lilian","Greenwood"));
        employees.add(new Employee(25349,"Margaret","Greenwood"));
        employees.add(new Employee(10243,"Dominic","Grieve"));
        employees.add(new Employee(11692,"Nia","Griffith"));
        employees.add(new Employee(24826,"Andrew","Griffiths"));
        employees.add(new Employee(10248,"John","Grogan"));
        employees.add(new Employee(11531,"Andrew","Gwynne"));
        employees.add(new Employee(24789,"Sam","Gyimah"));
        employees.add(new Employee(25357,"Louise","Haigh"));
        employees.add(new Employee(25616,"Kirstene","Hair"));
        employees.add(new Employee(24784,"Robert","Halfon"));
        employees.add(new Employee(25373,"Luke","Hall"));
        employees.add(new Employee(10256,"Fabian","Hamilton"));
        employees.add(new Employee(10257,"Philip","Hammond"));
        employees.add(new Employee(11927,"Stephen","Hammond"));
        employees.add(new Employee(24773,"Matthew","Hancock"));
        employees.add(new Employee(11610,"Greg","Hands"));
        employees.add(new Employee(10259,"David","Hanson"));
        employees.add(new Employee(25646,"Emma","Hardy"));
        employees.add(new Employee(10260,"Harriet","Harman"));
        employees.add(new Employee(11588,"Mark","Harper"));
        employees.add(new Employee(24954,"Richard","Harrington"));
        employees.add(new Employee(25308,"Carolyn","Harris"));
        employees.add(new Employee(24731,"Rebecca","Harris"));
        employees.add(new Employee(25600,"Trudy","Harrison"));
        employees.add(new Employee(24813,"Simon","Hart"));
        employees.add(new Employee(25310,"Helen","Hayes"));
        employees.add(new Employee(10265,"John","Hayes"));
        employees.add(new Employee(25358,"Sue","Hayman"));
        employees.add(new Employee(25154,"Christopher","Hazzard"));
        employees.add(new Employee(10267,"Oliver","Heald"));
        employees.add(new Employee(10268,"John","Healey"));
        employees.add(new Employee(25438,"James","Heappey"));
        employees.add(new Employee(24841,"Chris","Heaton-Harris"));
        employees.add(new Employee(25412,"Peter","Heaton-Jones"));
        employees.add(new Employee(24828,"Gordon","Henderson"));
        employees.add(new Employee(10682,"Mark","Hendrick"));
        employees.add(new Employee(25382,"Drew","Hendry"));
        employees.add(new Employee(10274,"Stephen","Hepburn"));
        employees.add(new Employee(11377,"Nick","Herbert"));
        employees.add(new Employee(10958,"Sylvia","Hermon"));
        employees.add(new Employee(25619,"Mike","Hill"));
        employees.add(new Employee(11605,"Meg","Hillier"));
        employees.add(new Employee(24782,"Damian","Hinds"));
        employees.add(new Employee(25427,"Simon","Hoare"));
        employees.add(new Employee(25648,"Wera","Hobhouse"));
        employees.add(new Employee(10281,"Margaret","Hodge"));
        employees.add(new Employee(11592,"Sharon","Hodgson"));
        employees.add(new Employee(10282,"Kate","Hoey"));
        employees.add(new Employee(25298,"Kate","Hollern"));
        employees.add(new Employee(24936,"George","Hollingbery"));
        employees.add(new Employee(25415,"Kevin","Hollinrake"));
        employees.add(new Employee(11661,"Philip","Hollobone"));
        employees.add(new Employee(11599,"Adam","Holloway"));
        employees.add(new Employee(10288,"Kelvin","Hopkins"));
        employees.add(new Employee(11973,"Stewart","Hosie"));
        employees.add(new Employee(10292,"George","Howarth"));
        employees.add(new Employee(14131,"John","Howell"));
        employees.add(new Employee(10295,"Lindsay","Hoyle"));
        employees.add(new Employee(25381,"Nigel","Huddleston"));
        employees.add(new Employee(25699,"Eddie","Hughes"));
        employees.add(new Employee(11859,"Jeremy","Hunt"));
        employees.add(new Employee(25284,"Rupa","Huq"));
        employees.add(new Employee(11792,"Nick","Hurd"));
        employees.add(new Employee(25375,"Imran","Hussain"));
        employees.add(new Employee(25674,"Alister","Jack"));
        employees.add(new Employee(24876,"Margot","James"));
        employees.add(new Employee(25675,"Christine","Jardine"));
        employees.add(new Employee(25067,"Dan","Jarvis"));
        employees.add(new Employee(24854,"Sajid","Javid"));
        employees.add(new Employee(25419,"Ranil","Jayawardena"));
        employees.add(new Employee(10312,"Bernard","Jenkin"));
        employees.add(new Employee(25431,"Andrea","Jenkyns"));
        employees.add(new Employee(25227,"Robert","Jenrick"));
        employees.add(new Employee(10999,"Boris","Johnson"));
        employees.add(new Employee(25597,"Caroline","Johnson"));
        employees.add(new Employee(11647,"Diana R.","Johnson"));
        employees.add(new Employee(24803,"Gareth","Johnson"));
        employees.add(new Employee(24895,"Jo","Johnson"));
        employees.add(new Employee(24758,"Andrew","Jones"));
        employees.add(new Employee(25637,"Darren","Jones"));
        employees.add(new Employee(11506,"David","Jones"));
        employees.add(new Employee(25289,"Gerald","Jones"));
        employees.add(new Employee(24835,"Graham","Jones"));
        employees.add(new Employee(10319,"Helen","Jones"));
        employees.add(new Employee(11003,"Kevan","Jones"));
        employees.add(new Employee(24745,"Marcus","Jones"));
        employees.add(new Employee(25673,"Sarah","Jones"));
        employees.add(new Employee(24720,"Susan Elan","Jones"));
        employees.add(new Employee(25220,"Mike","Kane"));
        employees.add(new Employee(11817,"Daniel","Kawczynski"));
        employees.add(new Employee(25670,"Gillian","Keegan"));
        employees.add(new Employee(11943,"Barbara","Keeley"));
        employees.add(new Employee(24816,"Liz","Kendall"));
        employees.add(new Employee(25389,"Seema","Kennedy"));
        employees.add(new Employee(25696,"Stephen","Kerr"));
        employees.add(new Employee(25662,"Afzal","Khan"));
        employees.add(new Employee(25612,"Gerard","Killen"));
        employees.add(new Employee(25297,"Stephen","Kinnock"));
        employees.add(new Employee(11026,"Greg","Knight"));
        employees.add(new Employee(25388,"Julian","Knight"));
        employees.add(new Employee(24770,"Kwasi","Kwarteng"));
        employees.add(new Employee(25418,"Peter","Kyle"));
        employees.add(new Employee(10348,"Eleanor","Laing"));
        employees.add(new Employee(25653,"Lesley","Laird"));
        employees.add(new Employee(25669,"Ben","Lake"));
        employees.add(new Employee(11032,"Norman","Lamb"));
        employees.add(new Employee(10678,"David","Lammy"));
        employees.add(new Employee(14026,"John","Lamont"));
        employees.add(new Employee(11715,"Mark","Lancaster"));
        employees.add(new Employee(24821,"Pauline","Latham"));
        employees.add(new Employee(24963,"Ian","Lavery"));
        employees.add(new Employee(25270,"Chris","Law"));
        employees.add(new Employee(24829,"Andrea","Leadsom"));
        employees.add(new Employee(25682,"Karen","Lee"));
        employees.add(new Employee(24765,"Phillip","Lee"));
        employees.add(new Employee(24760,"Jeremy","Lefroy"));
        employees.add(new Employee(10352,"Edward","Leigh"));
        employees.add(new Employee(10354,"Chris","Leslie"));
        employees.add(new Employee(10355,"Oliver","Letwin"));
        employees.add(new Employee(25181,"Emma","Lewell-Buck"));
        employees.add(new Employee(25686,"Andrew","Lewer"));
        employees.add(new Employee(24879,"Brandon","Lewis"));
        employees.add(new Employee(25356,"Clive","Lewis"));
        employees.add(new Employee(10357,"Ivan","Lewis"));
        employees.add(new Employee(10358,"Julian","Lewis"));
        employees.add(new Employee(11048,"Ian","Liddell-Grainger"));
        employees.add(new Employee(10361,"David","Lidington"));
        employees.add(new Employee(25677,"David","Linden"));
        employees.add(new Employee(25452,"Emma","Little Pengelly"));
        employees.add(new Employee(24754,"Stephen","Lloyd"));
        employees.add(new Employee(10367,"Tony","Lloyd"));
        employees.add(new Employee(25368,"Rebecca","Long-Bailey"));
        employees.add(new Employee(25652,"Julia","Lopez"));
        employees.add(new Employee(24716,"Jack","Lopresti"));
        employees.add(new Employee(24884,"Jonathan","Lord"));
        employees.add(new Employee(10371,"Tim","Loughton"));
        employees.add(new Employee(24910,"Caroline","Lucas"));
        employees.add(new Employee(11057,"Ian","Lucas"));
        employees.add(new Employee(25434,"Holly","Lynch"));
        employees.add(new Employee(25437,"Craig","Mackinlay"));
        employees.add(new Employee(25692,"Rachel","Maclean"));
        employees.add(new Employee(12004,"Angus","MacNeil"));
        employees.add(new Employee(25378,"Justin","Madders"));
        employees.add(new Employee(11087,"Khalid","Mahmood"));
        employees.add(new Employee(24788,"Shabana","Mahmood"));
        employees.add(new Employee(11798,"Anne","Main"));
        employees.add(new Employee(25285,"Alan","Mak"));
        employees.add(new Employee(25150,"Seema","Malhotra"));
        employees.add(new Employee(25346,"Kit","Malthouse"));
        employees.add(new Employee(11093,"John","Mann"));
        employees.add(new Employee(25383,"Scott","Mann"));
        employees.add(new Employee(10415,"Gordon","Marsden"));
        employees.add(new Employee(25635,"Sandy","Martin"));
        employees.add(new Employee(25433,"Rachael","Maskell"));
        employees.add(new Employee(13904,"Paul","Maskey"));
        employees.add(new Employee(25654,"Paul","Masterton"));
        employees.add(new Employee(25411,"Chris","Matheson"));
        employees.add(new Employee(10426,"Theresa","May"));
        employees.add(new Employee(24764,"Paul","Maynard"));
        employees.add(new Employee(10377,"Steve","McCabe"));
        employees.add(new Employee(25604,"Elisha","McCallion"));
        employees.add(new Employee(11455,"Kerry","McCarthy"));
        employees.add(new Employee(10381,"Siobhain","McDonagh"));
        employees.add(new Employee(25169,"Andy","McDonald"));
        employees.add(new Employee(25322,"Stewart","McDonald"));
        employees.add(new Employee(25301,"Stuart","McDonald"));
        employees.add(new Employee(10383,"John Martin","McDonnell"));
        employees.add(new Employee(11936,"Pat","McFadden"));
        employees.add(new Employee(25423,"Conor","McGinn"));
        employees.add(new Employee(24897,"Alison","McGovern"));
        employees.add(new Employee(25230,"Liz","McInnes"));
        employees.add(new Employee(24818,"Catherine","McKinnell"));
        employees.add(new Employee(10397,"Patrick","McLoughlin"));
        employees.add(new Employee(25475,"Jim","McMahon"));
        employees.add(new Employee(25647,"Anna","McMorrin"));
        employees.add(new Employee(25271,"John","McNally"));
        employees.add(new Employee(24888,"Stephen","McPartland"));
        employees.add(new Employee(24882,"Esther","McVey"));
        employees.add(new Employee(24919,"Ian","Mearns"));
        employees.add(new Employee(24804,"Mark","Menzies"));
        employees.add(new Employee(25367,"Johnny","Mercer"));
        employees.add(new Employee(25426,"Huw","Merriman"));
        employees.add(new Employee(24749,"Stephen","Metcalfe"));
        employees.add(new Employee(11545,"Ed","Miliband"));
        employees.add(new Employee(11389,"Maria","Miller"));
        employees.add(new Employee(25350,"Amanda","Milling"));
        employees.add(new Employee(24965,"Nigel","Mills"));
        employees.add(new Employee(11603,"Anne","Milton"));
        employees.add(new Employee(11115,"Andrew","Mitchell"));
        employees.add(new Employee(13836,"Francie","Molloy"));
        employees.add(new Employee(25406,"Carol","Monaghan"));
        employees.add(new Employee(11450,"Madeleine","Moon"));
        employees.add(new Employee(25630,"Damien","Moore"));
        employees.add(new Employee(25689,"Layla","Moran"));
        employees.add(new Employee(24938,"Penny","Mordaunt"));
        employees.add(new Employee(11732,"Jessica","Morden"));
        employees.add(new Employee(24732,"Nicky","Morgan"));
        employees.add(new Employee(25658,"Stephen","Morgan"));
        employees.add(new Employee(24912,"Anne Marie","Morris"));
        employees.add(new Employee(24966,"David","Morris"));
        employees.add(new Employee(24715,"Grahame","Morris"));
        employees.add(new Employee(24855,"James","Morris"));
        employees.add(new Employee(25342,"Wendy","Morton"));
        employees.add(new Employee(11970,"David","Mundell"));
        employees.add(new Employee(24872,"Ian","Murray"));
        employees.add(new Employee(24875,"Sheryll","Murray"));
        employees.add(new Employee(11132,"Andrew","Murrison"));
        employees.add(new Employee(24831,"Lisa","Nandy"));
        employees.add(new Employee(13736,"Bob","Neill"));
        employees.add(new Employee(25291,"Gavin","Newlands"));
        employees.add(new Employee(24948,"Sarah","Newton"));
        employees.add(new Employee(24809,"Caroline","Nokes"));
        employees.add(new Employee(24827,"Jesse","Norman"));
        employees.add(new Employee(25687,"Alex","Norris"));
        employees.add(new Employee(25679,"Neil","O'Brien"));
        employees.add(new Employee(25370,"Brendan","O'Hara"));
        employees.add(new Employee(25636,"Jared","O'Mara"));
        employees.add(new Employee(24955,"Matthew","Offord"));
        employees.add(new Employee(25638,"Fiona","Onasanya"));
        employees.add(new Employee(25317,"Melanie","Onn"));
        employees.add(new Employee(24807,"Chi","Onwurah"));
        employees.add(new Employee(24962,"Guy","Opperman"));
        employees.add(new Employee(25365,"Kate","Osamor"));
        employees.add(new Employee(11148,"Albert","Owen"));
        employees.add(new Employee(13852,"Ian","Paisley Jnr"));
        employees.add(new Employee(24779,"Neil","Parish"));
        employees.add(new Employee(24778,"Priti","Patel"));
        employees.add(new Employee(10473,"Owen","Paterson"));
        employees.add(new Employee(24880,"Mark","Pawsey"));
        employees.add(new Employee(25617,"Stephanie","Peacock"));
        employees.add(new Employee(24956,"Teresa","Pearce"));
        employees.add(new Employee(11626,"Mike","Penning"));
        employees.add(new Employee(25379,"Matthew","Pennycook"));
        employees.add(new Employee(11924,"John","Penrose"));
        employees.add(new Employee(24832,"Andrew","Percy"));
        employees.add(new Employee(24845,"Toby","Perkins"));
        employees.add(new Employee(24915,"Claire","Perry"));
        employees.add(new Employee(25364,"Jess","Phillips"));
        employees.add(new Employee(24709,"Bridget","Phillipson"));
        employees.add(new Employee(25377,"Chris","Philp"));
        employees.add(new Employee(25640,"Laura","Pidcock"));
        employees.add(new Employee(24747,"Christopher","Pincher"));
        employees.add(new Employee(25611,"Jo","Platt"));
        employees.add(new Employee(25690,"Luke","Pollard"));
        employees.add(new Employee(24756,"Daniel","Poulter"));
        employees.add(new Employee(10484,"Steve","Pound"));
        employees.add(new Employee(25407,"Rebecca","Pow"));
        employees.add(new Employee(25165,"Lucy","Powell"));
        employees.add(new Employee(25420,"Victoria","Prentis"));
        employees.add(new Employee(11172,"Mark","Prisk"));
        employees.add(new Employee(11946,"Mark","Pritchard"));
        employees.add(new Employee(25387,"Tom","Pursglove"));
        employees.add(new Employee(25417,"Jeremy","Quin"));
        employees.add(new Employee(25403,"Will","Quince"));
        employees.add(new Employee(24775,"Yasmin","Qureshi"));
        employees.add(new Employee(24815,"Dominic","Raab"));
        employees.add(new Employee(25700,"Faisal","Rashid"));
        employees.add(new Employee(25429,"Angela","Rayner"));
        employees.add(new Employee(10499,"John","Redwood"));
        employees.add(new Employee(25170,"Steve","Reed"));
        employees.add(new Employee(25332,"Christina","Rees"));
        employees.add(new Employee(24926,"Jacob","Rees-Mogg"));
        employees.add(new Employee(25681,"Ellie","Reeves"));
        employees.add(new Employee(24851,"Rachel","Reeves"));
        employees.add(new Employee(24868,"Emma","Reynolds"));
        employees.add(new Employee(24929,"Jonathan","Reynolds"));
        employees.add(new Employee(25321,"Marie","Rimmer"));
        employees.add(new Employee(10505,"Laurence","Robertson"));
        employees.add(new Employee(25280,"Gavin","Robinson"));
        employees.add(new Employee(10506,"Geoffrey","Robinson"));
        employees.add(new Employee(25405,"Mary","Robinson"));
        employees.add(new Employee(25691,"Matt","Rodda"));
        employees.add(new Employee(11199,"Andrew","Rosindell"));
        employees.add(new Employee(25531,"Douglas","Ross"));
        employees.add(new Employee(25684,"Danielle","Rowley"));
        employees.add(new Employee(25685,"Lee","Rowley"));
        employees.add(new Employee(10518,"Chris","Ruane"));
        employees.add(new Employee(24795,"Amber","Rudd"));
        employees.add(new Employee(25667,"Lloyd","Russell-Moyle"));
        employees.add(new Employee(24820,"David","Rutley"));
        employees.add(new Employee(10523,"Joan","Ryan"));
        employees.add(new Employee(25363,"Antoinette","Sandbach"));
        employees.add(new Employee(25302,"Liz","Saville-Roberts"));
        employees.add(new Employee(25331,"Paul","Scully"));
        employees.add(new Employee(25645,"Bob","Seely"));
        employees.add(new Employee(11216,"Andrew","Selous"));
        employees.add(new Employee(25385,"Naseem","Shah"));
        employees.add(new Employee(13864,"Jim","Shannon"));
        employees.add(new Employee(11917,"Grant","Shapps"));
        employees.add(new Employee(24902,"Alok","Sharma"));
        employees.add(new Employee(13934,"Virendra","Sharma"));
        employees.add(new Employee(10534,"Barry","Sheerman"));
        employees.add(new Employee(24893,"Alec","Shelbrooke"));
        employees.add(new Employee(25341,"Tommy","Sheppard"));
        employees.add(new Employee(25421,"Paula","Sherriff"));
        employees.add(new Employee(24847,"Gavin","Shuker"));
        employees.add(new Employee(25344,"Tulip","Siddiq"));
        employees.add(new Employee(11892,"David","Simpson"));
        employees.add(new Employee(10542,"Keith","Simpson"));
        employees.add(new Employee(24713,"Chris","Skidmore"));
        employees.add(new Employee(10544,"Dennis","Skinner"));
        employees.add(new Employee(11559,"Andrew","Slaughter"));
        employees.add(new Employee(25435,"Ruth","Smeeth"));
        employees.add(new Employee(11814,"Angela","Smith"));
        employees.add(new Employee(25432,"Cat","Smith"));
        employees.add(new Employee(24691,"Chloe","Smith"));
        employees.add(new Employee(25631,"Eleanor","Smith"));
        employees.add(new Employee(24802,"Henry","Smith"));
        employees.add(new Employee(25366,"Jeff","Smith"));
        employees.add(new Employee(24961,"Julian","Smith"));
        employees.add(new Employee(25672,"Laura","Smith"));
        employees.add(new Employee(24728,"Nick","Smith"));
        employees.add(new Employee(24797,"Owen","Smith"));
        employees.add(new Employee(25345,"Royston","Smith"));
        employees.add(new Employee(25390,"Karin","Smyth"));
        employees.add(new Employee(25601,"Gareth","Snell"));
        employees.add(new Employee(10555,"Nicholas","Soames"));
        employees.add(new Employee(25680,"Alex","Sobel"));
        employees.add(new Employee(24772,"Anna","Soubry"));
        employees.add(new Employee(10558,"John","Spellar"));
        employees.add(new Employee(10559,"Caroline","Spelman"));
        employees.add(new Employee(24909,"Mark","Spencer"));
        employees.add(new Employee(25353,"Keir","Starmer"));
        employees.add(new Employee(25306,"Chris","Stephens"));
        employees.add(new Employee(24759,"Andrew","Stephenson"));
        employees.add(new Employee(25304,"Jo","Stevens"));
        employees.add(new Employee(24799,"John","Stevenson"));
        employees.add(new Employee(24907,"Bob","Stewart"));
        employees.add(new Employee(24947,"Iain","Stewart"));
        employees.add(new Employee(24964,"Rory","Stewart"));
        employees.add(new Employee(25668,"Jamie","Stone"));
        employees.add(new Employee(10575,"Gary","Streeter"));
        employees.add(new Employee(25320,"Wes","Streeting"));
        employees.add(new Employee(24914,"Mel","Stride"));
        employees.add(new Employee(10576,"Graham","Stringer"));
        employees.add(new Employee(11406,"Graham","Stuart"));
        employees.add(new Employee(24853,"Julian","Sturdy"));
        employees.add(new Employee(25428,"Rishi","Sunak"));
        employees.add(new Employee(10580,"Desmond","Swayne"));
        employees.add(new Employee(25639,"Paul","Sweeney"));
        employees.add(new Employee(11971,"Jo","Swinson"));
        employees.add(new Employee(11265,"Hugo","Swire"));
        employees.add(new Employee(10582,"Robert","Syms"));
        employees.add(new Employee(11267,"Mark","Tami"));
        employees.add(new Employee(25327,"Alison","Thewliss"));
        employees.add(new Employee(25440,"Derek","Thomas"));
        employees.add(new Employee(10594,"Gareth","Thomas"));
        employees.add(new Employee(25279,"Nick","Thomas-Symonds"));
        employees.add(new Employee(25539,"Ross","Thomson"));
        employees.add(new Employee(11656,"Emily","Thornberry"));
        employees.add(new Employee(25371,"Maggie","Throup"));
        employees.add(new Employee(10596,"Stephen","Timms"));
        employees.add(new Employee(25430,"Kelly","Tolhurst"));
        employees.add(new Employee(24870,"Justin","Tomlinson"));
        employees.add(new Employee(25422,"Michael","Tomlinson"));
        employees.add(new Employee(25290,"Craig","Tracey"));
        employees.add(new Employee(10602,"David","Tredinnick"));
        employees.add(new Employee(25439,"Anne-Marie","Trevelyan"));
        employees.add(new Employee(10604,"Jon","Trickett"));
        employees.add(new Employee(24941,"Elizabeth","Truss"));
        employees.add(new Employee(25374,"Thomas","Tugendhat"));
        employees.add(new Employee(25313,"Anna","Turley"));
        employees.add(new Employee(24767,"Karl","Turner"));
        employees.add(new Employee(10610,"Derek","Twigg"));
        employees.add(new Employee(10611,"Stephen","Twigg"));
        employees.add(new Employee(25623,"Liz","Twist"));
        employees.add(new Employee(24950,"Chuka","Umunna"));
        employees.add(new Employee(11905,"Ed","Vaizey"));
        employees.add(new Employee(11475,"Shailesh","Vara"));
        employees.add(new Employee(10614,"Keith","Vaz"));
        employees.add(new Employee(24852,"Valerie","Vaz"));
        employees.add(new Employee(24814,"Martin","Vickers"));
        employees.add(new Employee(11500,"Theresa","Villiers"));
        employees.add(new Employee(11461,"Charles","Walker"));
        employees.add(new Employee(24862,"Robin","Walker"));
        employees.add(new Employee(25671,"Thelma","Walker"));
        employees.add(new Employee(11668,"Ben","Wallace"));
        employees.add(new Employee(25372,"David","Warburton"));
        employees.add(new Employee(25395,"Matt","Warman"));
        employees.add(new Employee(25644,"Giles","Watling"));
        employees.add(new Employee(11309,"Tom","Watson"));
        employees.add(new Employee(25328,"Catherine","West"));
        employees.add(new Employee(25701,"Matt","Western"));
        employees.add(new Employee(25398,"Helen","Whately"));
        employees.add(new Employee(24769,"Heather","Wheeler"));
        employees.add(new Employee(10630,"Alan","Whitehead"));
        employees.add(new Employee(25651,"Martin","Whitfield"));
        employees.add(new Employee(25318,"Philippa","Whitford"));
        employees.add(new Employee(24944,"Craig","Whittaker"));
        employees.add(new Employee(10632,"John","Whittingdale"));
        employees.add(new Employee(11318,"Bill","Wiggin"));
        employees.add(new Employee(11323,"Hywel","Williams"));
        employees.add(new Employee(25621,"Paul","Williams"));
        employees.add(new Employee(24830,"Chris","Williamson"));
        employees.add(new Employee(24729,"Gavin","Williamson"));
        employees.add(new Employee(13933,"Phil","Wilson"));
        employees.add(new Employee(11374,"Sammy","Wilson"));
        employees.add(new Employee(10648,"Rosie","Winterton"));
        employees.add(new Employee(11333,"Pete","Wishart"));
        employees.add(new Employee(24761,"Sarah","Wollaston"));
        employees.add(new Employee(25362,"Mike","Wood"));
        employees.add(new Employee(24837,"John","Woodcock"));
        employees.add(new Employee(25360,"William","Wragg"));
        employees.add(new Employee(11791,"Jeremy","Wright"));
        employees.add(new Employee(25649,"Mohammad","Yasin"));
        employees.add(new Employee(24822,"Nadhim","Zahawi"));
        employees.add(new Employee(25386,"Daniel","Zeichner"));
        Collections.shuffle(employees);
        return employees;
    }
}
