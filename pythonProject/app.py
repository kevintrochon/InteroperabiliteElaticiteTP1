from flask import Flask, render_template, request
import zeep

app = Flask(__name__)

@app.route('/')
def home():
    #dictionnaire de data
    data = {'user':'kevin','machine':'windows'}
    # affichage
    return render_template('index.html',title='Calcule',data=data)

@app.route('/traitement',methods=["POST","GET"])
def calcul_k_moyen():
    path = request.form.get('file')
    nb_cluster = request.form.get('nb_cluster')
    wsdl = 'http://localhost:8685/?wsdl'
    client = zeep.Client(wsdl=wsdl)
    data = client.service.calculKMoyen(path.replace('\\','\\\\'), nb_cluster)
    return render_template('resultat.html',title='Resultat',data=data)

if __name__ == '__main__':
    app.run(host='127.0.0.1',port=9999,debug=True)
