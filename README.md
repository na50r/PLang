# Introduction
* Hello there. 
* I'm just a student at the University of Zurich, reaching my 4th semester at the time of repo-creation
* I flunked a course on data structures and algorithms, it involved **C-coding** to some extend, so **I'm intending to re-study C**
* At the same time, I'm about to attend a course focused on Software Engineering, where **Java** seems to be a central pillar, so I'll be studying that as well.
* And lastly, there is one course on AI that apparently requires good math and good **Python** skills, so presumably **I'll be also studying a bit of Python, specifically NumPy**
* Hence this repo just contains some random examples I can come up with, which might help one person or the other to understand some concept/technique.

# Public Repo
* I decided to make this repo public because I won't use it for anything important anyway, it's just self-study, so you'll just find a bunch of code snippets I came up with and you can use them as you like or clown on me by providing a more optimized version of it. So treat this repo as something you can check out once in a while.

# Git Stuff
## Basic Commands for Git (Use as Reference when working in a team with git-noobs while being one yourself)
### Cloning
```git
git clone <URL> repo
```
* Clones the remote repository into a newly created folder called `repo` in the current directory.

### Adding, Commiting and Pushing
* This is how you mainly use `git` most of the time (on the command line interface, if you wanna be fancy, you can do it directly on your IDE like VsCode or GitLab's Online IDE)
```git
git add . / git add --all
//Adds the changes onto the stack

git commit -m <message>
//Commits the changes into the local repository, message mandatory.

git push origin <branch_name>
//Pushes local repo into remote repo's branch
```

### Branches
* Think of `git` as your little local box. After making changes in your code, you commit it into the box and then push it to the remote repository. Sometimes, it is better to do all of this on a branch, a copy, of the original repository, such that changes can be reviewed by peers. If the changes are ok, the branch can be *merged* with the main/master branch of the remote repository. (Fancy word for 'overwriting')

```git
git branch 
//Shows existing branches

git branch <new_branch_name> 
//Creates new branch

git branch d <branch_name>
//Deletes branch 

git fetch origin
//Gets history of what has happened on the remote repo

git merge origin/master
//Merges the local master branch with the master branch of the remote repo called origin/master.

git pull
//Updates local Git by extracting stuff from remote repo
```

* Recommended for `git` beginners.
```
git checkout -b <branch_name> origin/<branch_name>
```
*Start of project:*
1. `git clone <URL> repo`
2. `cd repo`
3. `git branch <your_new_branch_name>`
4. `git checkout <your_new_branch_name`
5. *Do stuff or not*
6. `git add .` *(Add changes)*
7. `git commit -m <message>`
8. `git push origin <your_new_branch_name>`

*Clumsy Procedure:*
* If you're a beginner with `git`, do the following.
1. `git clone <URL> repo`
2. `cd repo`
3. `git branch` *(check on which branch you are)*
4. `git checkout -b <branch_name> origin/<branch_name>`
5. *Work on your code*
6. `git add .` *(Add changes)*
7. `git commit -m <message>`
8. `git push origin <branch_name>`
9. *Delete* `repo` *folder*
10. *Repeat*
* This method is safe and noob friendly but probably not how most devs would do it. When you have a on-off relationship with `git`, I recommend you memorizing this method.

*Sophisticated Procedure (Uncertain)*
* I'm not a pro with `git`, so I'm not sure eihter.
* Instead of deleting `repo` folder, you can also just track the changes that were made on the remote repository and update your local repo with `git pull`
* Commit messages can be expanded to `git commit -m "Title" -m "Description ..."`
* **To be Continued**

*Presumably Used by Git Pros*
* Apparently, some do this thing with pull requests/issues but idk how that works yet. 