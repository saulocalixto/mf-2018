import React, { Component } from 'react';
import './App.css';
import {Map, InfoWindow, Marker, GoogleApiWrapper} from 'google-maps-react';

const style = {
  width: '50%',
  height: '50%'
}

const LoadingContainer = (props) => (
  <div>Carregando o mapa, espere!</div>
)

class GMap extends Component {
    
      render() {
        return (
            <Map
              google={this.props.google}
              style={style}
              center={{
                lat: this.props.local.lat,
                lng: this.props.local.lng
              }}
              zoom={70}
            >
              <Marker onClick={this.onMarkerClick}
                name={'Current location'} 
                position={{lat: this.props.local.lat, lng: this.props.local.lng}}/>
            </Map>
        );
      }
}

export default GoogleApiWrapper({
  apiKey: ('AIzaSyBXj1OuUdOzmDtC2G3NBIdgSVwZL3OGktQ'),
  LoadingContainer: LoadingContainer
})(GMap)