package com.unimelb.swen30006.workshops;

// Sample private submission class to be replaced by your implementation
class Submission {

    private int attemptNum ;

    private File[] files;

    private int numFiles;

    public int getAttemptNum() {
        return attemptNum;
    }

    public void setAttemptNum(int attemptNum) {
        this.attemptNum = attemptNum;
    }

    public File[] getFiles() {
        return files;
    }

    public void setFiles(File[] files) {
        this.files = files;
    }

    public int getNumFiles() {
        return numFiles;
    }

    public void setNumFiles(int numFiles) {
        this.numFiles = numFiles;
    }

    // Return two fake files
    public File[] includedFiles(){
        File[] files = new File[2];
        files[0] = new File();
        files[1] = new File();
        return files;
    }
}
