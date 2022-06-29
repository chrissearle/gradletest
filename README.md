# Gradle test

Test of gradle + spring boot + embedding a vue app via /public static

## Initial setup:

### Backend

- Spring initializr - spring boot, kotlin, gradle, jar, java 17. Add spring-mvc
- Add a single rest controller that just returns some json of some kind on /api

### Frontend

Vue - but that's not too important - just something that can be built with npm to SPA

- npm init vue@latest - call the app "frontend", TS but no other extras (no test, no lint, no store etc)
- cd frontend
- npm install
- Delete all components, assets, icons
- Simplify App.vue to just a "fetch /api" and dump result to page as string

## CORS

When running each thing locally in dev - need to proxy /api from frontend to backend to avoid CORS. When built - will be all on the same host/port anyway.

## Local running

- Run spring boot app - port 8080 - answers to /api
- Run vue app - port 3000 - proxies 3000/api to 8080/api

## Build

Embeds vue build under /public in the built jar
