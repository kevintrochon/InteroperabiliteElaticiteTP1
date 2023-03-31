from flask import Flask, render_template, request
import zeep

app = Flask(__name__)

@app.route('/')
def home():
    return render_template('index.html',title='Calcule K Means')

@app.route('/resultat',methods=["POST","GET"])
def calcul_k_moyen():
    path = request.form.get('file')
    nb_cluster = request.form.get('nb_cluster')
    wsdl = 'http://localhost:8685/?wsdl'
    client = zeep.Client(wsdl=wsdl)
    data = client.service.calculKMoyen(path.replace('\\','\\\\'), nb_cluster)
    value = []
    for item in data:
        value.append(item['item'])
    return render_template('resultat.html',title='Resultat',salaires=value)

if __name__ == '__main__':
    app.run(host='127.0.0.1',port=9899,debug=True)
