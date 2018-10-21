import React, { Component } from 'react';
import './App.css';
import Grid from './Grid'
import { Header } from 'semantic-ui-react'

class App extends Component {
  render() {
    return (
      <div className="App">
      <Header
        as='h1'
        content='Estabelecimentos'
        subheader='Um monte de estabelecimentos de saúde'
        />
        <Grid />
      </div>
    );
  }
}

export default App;
