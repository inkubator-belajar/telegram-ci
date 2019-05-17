## persiapan :

1. kotlin
2. maven

## langkah :

1. paket di start.spring.io
   - web
   - thymeleaf
2. buat index.html di templates
3. buat controller
4. buat repo di github
5. add repo to local
   - git remote add github git@github.com:repo
   - git pull github master
6. pastikan permission untuk heroku di github sudah di grant
   - setting / application / authorized oauth apps / heroku -> check grant
7. create new app di heroku
8. pilih deployment method : github
9. pilih repository-nya -> connect
10. enabled automatic deploys
11. di heroku apps settings, buildpacks diisi java
12. push ke repo via dev-* branch
13. create pull request to org
14. merge, wait and see for build and changes
15. continue to dev
