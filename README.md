# 🍔 kmpp-template

![Kotlin](https://img.shields.io/badge/kotlin-%230095D5.svg?style=for-the-badge&logo=kotlin&logoColor=white&color=0d1117)
![Discord](https://img.shields.io/discord/908438033613848596?style=for-the-badge&logo=discord&logoColor=white&colorA=0d1117&colorB=1a222e)
![CI](https://img.shields.io/github/workflow/status/playhexalite/kmpp-template/Kotlin%20CI%20with%20Gradle.svg?colorA=0d1117&colorB=1a222e&label=Workflow&style=for-the-badge&logo=githubactions&logoColor=white)

A simple template for Kotlin JVM and Multiplatform (JVM/JS) targeted libraries, relying on Gradle precompiled plugins 
and enabled for publishing and unit/integration testing.

### 📜 Instructions: IntelliJ

1. `git clone https://git.hexalite.org/kmpp-template.git <project name>`
2. Open this project on any IntelliJ IDEA-based IDE, and press <kbd>Ctrl+Shift+R</kbd>. In the first input box,
   you just need to put `kmpp`, in the second one you put the name you desire for this project. Then you need to do
   another replacement: for example, if you chose 'josisvaldo' as project name, you need to replace
   `LibrariesForjosisvaldo` with `LibrariesForJosisvaldo`.
3. Rename `buildSrc/main/java/*-conventions.gradle`, `kmpp-core` and `kmpp.libs.toml`: replace `kmpp` by the 
   name of the project you have put in the second step.
