# Install dependencies
yarn install --production --ignore-optional --pure-lockfile --non-interactive

# Build app
yarn build

# Not necessary, but helps with https://medium.com/@pshrmn/demystifying-single-page-applications-3068d0555d46
cp public/index.html public/404.html

# CRA and gitlab pages both use the public folder. Only do this in a build pipeline.
mv public _public

# Move build files to public dir for Gitlab Pages
mv build public
