public class Thesis extends Book {


    public Thesis(String title, String author, int publicationYear, int ISBN, String thesisTopic) {
        super(title, author, publicationYear, ISBN);
    }

    // Additional methods specific to Thesis

    public class IotThesis extends Thesis {

        public IotThesis(String title, String author, int publicationYear, int ISBN, String thesisTopic, String subTopic) {
            super(title, author, publicationYear, ISBN, thesisTopic);
            
        }

        // Additional methods specific to IotThesis
    }

    public class CloudComputingThesis extends Thesis {
   

        public CloudComputingThesis(String title, String author, int publicationYear, int ISBN, String thesisTopic, String subTopic) {
            super(title, author, publicationYear, ISBN, thesisTopic);
        
        }

        // Additional methods specific to CloudComputingThesis
    }

    public class RoboticsThesis extends Thesis {


        public RoboticsThesis(String title, String author, int publicationYear, int ISBN, String thesisTopic, String subTopic) {
            super(title, author, publicationYear, ISBN, thesisTopic);
    
        }

        // Additional methods specific to RoboticsThesis
    }
}
