// var estabelecimentos;
// define('estabelecimentos', function (require) {
//     estabelecimentos = require("estabelecimentos.json");
// });

import estabelecimentos from "../estabelecimentos.json";

$(function() {
    var model = {
       estabelecimentos: [
        {
            codigo: "",
            razaoSocial: "",
            longitude: "",
            latitude: ""
        }
       ],
       retorno: null
    };

    var octopus = {
        setaRepositorio: function(){
            
            var mydata = JSON.parse(estabelecimentos);
        },

        pegarEstudantes: function() {
            if(model.retorno == null)
            {
                model.retorno = JSON.parse(localStorage.attendance);
            }
            return model.retorno;
        },

        atualizarEstudantes: function(nome, lista) {
            this.pegarEstudantes()[nome] = lista;
        },

        pegarNomes: function() {
            return model.nomesEstudantes;
        },

        contaFaltas: function(presencas) {
            var faltas = 0;
            presencas.each(function(index, input) {
                if (!$(input).prop('checked')) {
                    faltas++;
                }
            });
            return faltas;
        },

        init: function(){
            this.setaRepositorio();
            view.init()
        },

        marcarCheckBox: function (elemento, presenca) {
            elemento.prop('checked', presenca);
        }
    };

    var view = {
        init(){
            this.linhaEstudante = $(".contemEstudantes");
            this.render();
        },

        render() {
            _this = this;
            this.classStudent =  $(`<tr class="student">`);
            octopus.pegarNomes().forEach(function(nome, i){
                classStudent =  $(`<tr class="student">`);
                var nomeEstudante = $(`<td class="name-col">${nome}</td>`);
                _this.linhaEstudante.append(classStudent);
                classStudent.append(nomeEstudante);
                _this.renderInputs(nome);
                var faltas = `<td class='missed-col'>0</td>`
                this.classStudent.append(faltas);
            });
            this.renderQuantidadeFaltas();
        },

        renderInputs(nome) {
            _this = this;
            octopus.pegarEstudantes()[nome].forEach(function(input, index) {
                var marcar = $(`<td class='attend-col'><input type='checkbox'></td>`);
                this.classStudent.append(marcar);
                var seletor = $(`.name-col:contains('${nome}')`)
                    .siblings('.attend-col')
                    .eq(index)
                    .children('input')
                octopus.marcarCheckBox(seletor, input);
            });
        },

        renderQuantidadeFaltas() {
            _this = this;
            octopus.pegarNomes().forEach(function(nome, i){
                var listaInputs = $(`.name-col:contains('${nome}')`)
                .siblings('.attend-col')
                .children('input');
                
                _this.renderNumeroFaltas(listaInputs, nome);

                $('.student').on('change', 'input[type=checkbox]', function() {
                    _this.renderNumeroFaltas(listaInputs, nome);
                });
            });
        },

        renderNumeroFaltas(listaFaltas, nome){
            var quantidadeDeFaltas = octopus.contaFaltas(listaFaltas);
            $(`.name-col:contains('${nome}')`)
                .siblings('.missed-col')
                .text(quantidadeDeFaltas);
            var novaLista = {};
            novaLista[nome] = [];
            
            listaFaltas.each(function() {
                novaLista[nome].push($(this).prop('checked'));
            });
            octopus.atualizarEstudantes(nome, novaLista[nome]);
            localStorage.attendance = JSON.stringify(octopus.pegarEstudantes());
        }
    }
    octopus.init();
}());