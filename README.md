# React Native with ClojureScript and Storybook

## Getting Started

### React Native

https://reactnative.dev/docs/environment-setup

### Clojure

https://clojure.org/guides/getting_started

### Krell

```bash
clj -M -m cljs.main -co "{:deps-cmd \"yarn\"}" --install-deps
```


## Usage

1. Start the ClojureScript REPL.
```bash
yarn cljs:repl
```

2. Start Metro.
```bash
yarn start
```

3. Build and launch the app.
```bash
yarn android

# or

yarn ios
```

## Workflow

JavaScript components and Storybook tests are in `js/`, named `Component.js` and
`Component.stories.js` respectively. Run `yarn storybook` for an interactive
environment showing the look and feel of your components; they will live-reload
when edited.

You can require your JS components in your ClojureScript views with
```clojure
(def component-name
  (r/adapt-react-class
    (.-default (js/require "../js/ComponentName.js"))))
```

Note the path is just `../`, regardless of where in your ClojureScript directory
hierarchy you are working from.

## Rationale

Clojure, with its functional core and immutable data structures, is ideally
suited to managing state in user applications. ClojureScript extends this reach
anywhere JavaScript can go, and React Native puts a performant, well-supported,
JS environment on mobile and desktop devices with a deep ecosystem of usable
libraries.

When it comes to building ClojureScript apps on React Native, the majority of
the benefit comes from lifting state out of the land of JavaScript and into
a functional library like Reagent. Design of components can be left to
JavaScript, functioning essentially as markup, with tools like Storybook
providing quick feedback on layout. This template provides the dependencies
and plumbing to connect these three main tools.

## References

* [ClojureScript in the Age of Typescript -- David Nolen](https://www.youtube.com/watch?v=3HxVMGaiZbc&t=5s)
* [CLJSRN.org](https://cljsrn.org)
* [Krell](https://github.com/vouch-opensource/krell)
* [Storybook](https://storybook.js.org)
* [<3 Template](https://github.com/joshuamiller/react-native-template-cljs-krell-storybook)
