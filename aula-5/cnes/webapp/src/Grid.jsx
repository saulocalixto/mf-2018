import React, { Component } from 'react';
import './App.css';
import estabelecimentos from './estabelecimentos.json'
import "react-table/react-table.css";

class Grid extends Component {

  state = {
    index: 10,
    filtro: "",
    estabelecimentosParciais: []
  };

  componentDidMount = () => {
    this.setState({ estabelecimentosParciais: estabelecimentos.slice(0, 10), });
  }

  handleScroll = (e) => {
    let bottom = e.target.scrollHeight - e.target.scrollTop === e.target.clientHeight;
      if (bottom) {
        this.setState({ index: this.state.index + 10, });
        console.log(this.state.index)
      }
  };

  render() {
    return (
      <div>
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
                <tr key={estabelecimento.codigoEstabelecimento}>
                  <td>{estabelecimento.codigoEstabelecimento}</td>
                  <td>{estabelecimento.razaoSocial}</td>
                </tr>
              ))
            }
          </tbody>
        </table>
      </div>
    );
  }
}

export default Grid;