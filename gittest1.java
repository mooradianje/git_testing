/* this will just be a file that reminds the procedure 
for using git on the cloud.*/
/*
1:  git config --global user.email "[email@address]"
2:  git config --global user.name "[username]"
^^the above allows git to work online

TO GET A REPO:
git clone https://github.com/[username]/[gitrepo (no.git)] 

repo should now be on local drive (cd /[gitrepo])
cd [gitrepo]

you can check the BRANCH with:
git branch

you can STAGE and COMMIT each file with the following
git add [filename.ext]
git add .
^adds all files in directory
git commit -m "this is a message for when you upload a change"

this only does it on the LOCAL side of things - 
changes will be stored with the following command:
git push origin master
^enter your username & password after this, check github

git log
^this lists a log of changes made in the structure

git status
^this gives you the status of changed files (in progress)

git checkout -- [filename.ext]
^this restores the last backup for git

NEW NOTE 2/4 
    git repo must be initialized on github in order to push 


public class gittest1 {
    
    public static void main(String[] args) {
        System.out.println("hello world");
    }
    
}