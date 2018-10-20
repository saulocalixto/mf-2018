import React, { Component } from 'react';
import './App.css';
import estabelecimentos from './estabelecimentos.json'
import "react-table/react-table.css";
import Map from './GMap'

class Grid extends Component {

  state = {
    index: 10,
    filtro: "",
    estabelecimentosParciais: [],
    local: {lat: 0, lng: 0},
  };

  componentDidMount = () => {
    this.setState({ estabelecimentosParciais: estabelecimentos.slice(0, 10), });
  }

  handleScroll = (e) => {
    let bottom = e.target.scrollHeight - e.target.scrollTop === e.target.clientHeight;
      if (bottom) {
        this.setState({ index: this.state.index + 10, });
      }
  };

  render() {
    return (
      <div style={{width: '100%', height: '400px'}}>
        <table className="tg">
          <thead>
            <tr>
              <th>CNES</th>
              <th>NOME</th>
            </tr>
          </thead>
          <tbody onScroll={this.handleScroll}>
            {
              estabelecimentos.slice(0, this.state.index).map(estabelecimento => (
                <tr 
                  key={estabelecimento.codigoEstabelecimento}
                  onClick={() => this.setState({ local: {lat: estabelecimento.latitude, lng: estabelecimento.longitude} })}>
                  <td>{estabelecimento.codigoEstabelecimento}</td>
                  <td>{estabelecimento.razaoSocial}</td>
                </tr>
              ))
            }
          </tbody>
        </table>{
          this.state.local.lat && this.state.local.lng ? 
          (<Map local={this.state.local} style={{padding: 10}}/>)
          : <div>Não foi informada uma latitude e longitude válidos!</div>
        }
        
      </div>
    );
  }
}

export default Grid;