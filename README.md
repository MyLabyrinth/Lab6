# Lab 6 - Conditionals and Loops

## Recap: Lab (Github) Workflow 📄 - How to Work on Labs

Follow these steps for every lab carefully to access, complete, and submit your assignment.

1.  **Accept the Assignment**

    - Open the Lab Assignment Link the professor provided.
    - Click **"Accept the assignment"**. This will create your personal assignment repository on GitHub under the correct organization.
    - You'll be taken to your repository page. Verify that the URL looks like `github.com/organization/lab-number-yourusername`.

2.  **Clone the Repository to Your Computer**

    - On your repository page, click the blue **`<> Code`** button.
    - In the dropdown menu, choose **"Open with GitHub Desktop"**.
    - GitHub Desktop will launch. Choose a preferred local folder on your computer to save the project and click **"Clone"**.
    - If asked "How are you planning on using this fork?", select **"For my own purpose"** and continue.

3.  **Open in VS Code and Start Coding**

    - In GitHub Desktop, ensure the "Current repository" is the one for this lab.
    - Click the **"Open in Visual Studio Code"** button.
    - VS Code will open the project folder. You can now begin writing your solutions in the `Lab6.java` file.

4.  **Save and Submit Your Work**

    - **Commit (Save) Changes**: As you work, save your file in VS Code (`Ctrl+S` or `Cmd+S`). To record your progress, go to the **Source Control** tab (the fork icon) on the left sidebar in VS Code. Type a descriptive message in the message box (e.g., "Finished Task 1 and 2") and click **"Commit"**. You must enter a message.
    - **Push (Submit) to GitHub**: When you are finished with the lab or want to back up your work, go back to GitHub Desktop. Click the **"Push origin"** button at the top of the window. This sends your committed changes from your computer to your GitHub repository online.

5.  **Verify Your Submission**
    - After you push, you can click **"View on GitHub"** in GitHub Desktop to open your repository in the browser.
    - On the GitHub website, make sure you are viewing the `main` branch and confirm that all of your latest code is visible.

---

## Lab 6 Tasks

### `If this then that`

## Task 1: Pass/Fail

**Objective:** Ask the user for their grade. If they get a 60 or higher, print that they shall pass otherwise print that they shall not pass.

### Example Output

```
Grade: 60

You shall pass!
```

---

## Task 2: Make the Grade

**Objective:** Ask the user for their grade and print their letter equivalent. 90 or higher is A. 80 or higher is B. 70 or higher is C. 60 or higher is D. Anything else is F.

### Example Output

```
Grade: 75

C
```

---

## Task 3: Hello, Professor

**Objective:** Ask the user for their name. When they enter my name, print Hello Professor. Otherwise, print Hello Student.

### Example Output

```
Name: Sarah

Hello Professor!
```

---

## Task 4: Sorting Hat

**Objective:** You are writing a program for the sorting hat from Harry Potter. Ask the user for their name and then print what house they belong to.

- Harry Potter is in Gryffindor
- Draco Malfoy is in Slytherin
- Luna Lovegood is in Ravenclaw
- If they enter any other name, then they are in Hufflepuff

### Example Output

```
Name: Batman

Batman is in Hufflepuff!
```

---

## Task 5: Random Sorting Hat

**Objective:** People did not like that almost everyone ended up in Hufflepuff. This time, they are ending up in a random house! Choose a random number and then print which house they ended up in:

- 0 = Gryffindor
- 1 = Slytherin
- 2 = Hufflepuff
- 3 = Ravenclaw

**Hint:** Don't forget to: import random

### Example Output

```
Name: Lauren

Lauren is in Ravenclaw
```

(The result will vary because it is random)

---

## Task 6: Weighted Sorting Hat

**Objective:** When reviewing the literature, you noticed it is as if almost everyone is either in Gryffindor or in Slytherin with some Hufflepuff and almost no Ravenclaw! You decide to update your sorting hat to make it weighted (favor some over the others).

Generate a number from 1 to 100, then based on the ranges below, tell them which house they are in:

- 1 to 40: Gryffindor
- 41 to 70: Slytherin
- 71 to 90: Hufflepuff
- 91 to 100: Ravenclaw

### Example Output

```
Name: Andrew

Andrew is in Slytherin
```

(The result will vary because it is random)

---

### `Loop-the-loop`

## Task 7: It's a secret

**Objective:** Ask the user for a password. If they get it wrong, tell them they got it wrong. Keep looping until they get it right.

### Example Output

```
What's the password? pizza

Wrong!

What's the password? Batman

Wrong!

What's the password? secret

Correct!
```

---

## Task 8: The Final Countdown

**Objective:** Ask the user for a number, then count down from that number and print, We have liftoff!

### Example Output

```
Number: 5

5

4

3

2

1

We have liftoff!
```

---

## Task 9: Characters

**Objective:** Ask the user to enter their name. Use a loop to print out each character.

### Example Output

```
Name: Groot

G

r

o

o

t
```

---

## Task 10: esreveR

**Objective:** Ask for a name and then print it in reverse.

### Example Output

```
Name: Korg

g

r

o

K
```

---

## Task 11: Step Counter

**Objective:** Ask for a number and then print the numbers with a growing amount of space before them. Notice the first one has no spaces.

### Example Output

```
Count: 5

1

 2

  3

   4

    5
```

---

## Need Help?

Ask me for help! I'm literally in the same room as you!

## Finished?

When you are done with the labs (finished and committed on GitHub properly), call me over and show me. Tell me your name and I'll mark you as done!
