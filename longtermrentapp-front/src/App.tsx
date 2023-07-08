import "bootstrap/dist/css/bootstrap.min.css";
import 'jquery/dist/jquery.min.js';
import 'bootstrap/dist/js/bootstrap.min.js';
import "./App.css";

import React from "react";
import {
    BrowserRouter as Router,
    useRoutes,
  } from "react-router-dom";
import LoginPage from "./components/LoginPage";

const AppRoutes = () => {
  let routes = useRoutes([
    { path: "/", element: <LoginPage /> },
    // { path: "/main", element: <MainPage /> }
  ]);
  return routes;
};

const App: React.FC = () => {
      return (
        <Router>
          <AppRoutes />
        </Router>
      );
  }

export default App;