## 2006ICT Tetris Milestone 1
Group project  for 2006ICT Object Oriented Software Development

## Project Status

Initial skeleton created for review. 
GitHub Repo created.

Project structure, team roles and workflow are tbc.

## Technology 

- JDK 25
- JavaFX 21.0.6
- Maven
- IntelliJ IDEA
- Git & GitHub

## Project Folder Structure

src/
|--main/
   |--java/
   |--resources

Project following the standard Maven directory structure

## Opening the Project

1. Clone the GitHub repository.
2. Open IntelliJ IDEA.
3. Select Open.
4. Select the cloned project folder.
5. Allow IntelliJ to load the Maven project.
6. Confirm that JDK 25 is selected as the Project SDK.
7. Allow Maven to download the required dependencies.
8. Run the JavaFX launcher or application class.


## Proposed Team Workflow

The following workflow is a draft and will be reviewed by the group:

- Work will be completed on feature or documentation branches.
- Changes will be submitted through pull requests.
- Pull requests should be reviewed by another team member before merging.
- Direct commits to `main` should be avoided after the initial setup.
- Commit messages should clearly describe the completed change.
- The application should be tested after changes are merged.

Example branch names:

`````
feature/main-menu
feature/configuration-screen
feature/gameplay
feature/row-clearing
docs/functional-requirements
`````

## Milestone 1 Scope

The Milestone 1 application is expected to include:

- Splash window
- Main screen
- Configuration screen
- High-score screen
- Basic Tetris gameplay
- Smooth tetromino movement
- Full-row detection and erasure
- Pause and resume
- Exit confirmation dialogue

## Project Documentation

Detailed project documents will be stored in the `docs` directory, including:

- Project management records
- Draft role allocation
- Meeting records
- Functional and non-functional requirements
- UML diagrams
- Selected GitHub and implementation evidence