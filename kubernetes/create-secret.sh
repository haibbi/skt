kubectl create secret docker-registry regcred \
  --docker-server=docker.pkg.github.com \
  --docker-username=USERNAME \
  --docker-password=TOKEN[repo/read:packages] \
  --docker-email=EMAIL
